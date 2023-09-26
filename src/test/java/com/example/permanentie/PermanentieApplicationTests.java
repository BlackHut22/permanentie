package com.example.permanentie;

import com.example.permanentie.DTOMappers.GroupDTOMapper;
import com.example.permanentie.DTOMappers.UserDTOMapper;
import com.example.permanentie.DTOs.GroupDTO;
import com.example.permanentie.DTOs.UserDTO;
import com.example.permanentie.models.Group;
import com.example.permanentie.models.Rooster;
import com.example.permanentie.models.Timeslot;
import com.example.permanentie.models.User;
import com.example.permanentie.repos.GroupRepo;
import com.example.permanentie.repos.RoosterRepo;
import com.example.permanentie.repos.TimeslotRepo;
import com.example.permanentie.repos.UserRepo;
import com.example.permanentie.services.GroupService;
import com.example.permanentie.services.RoosterService;
import com.example.permanentie.services.TimeslotService;
import com.example.permanentie.services.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@SpringBootTest
class PermanentieApplicationTests {

    private User user;
    private Group group;
    private Rooster rooster;
    private Timeslot timeslot;
    @InjectMocks
    private UserService userService;
    @InjectMocks
    private GroupService groupService;
    @InjectMocks
    private RoosterService roosterService;
    @InjectMocks
    private TimeslotService timeslotService;

    @Mock
    private UserRepo userRepo;
    @Mock
    private GroupRepo groupRepo;
    @Mock
    private RoosterRepo roosterRepo;
    @Mock
    private TimeslotRepo timeslotRepo;

    @Test
    void contextLoads() {
        user = User.builder().id(1).username("Junior").build();
        Set<User> users = new HashSet<>();
        users.add(user);
        group = Group.builder().id(1).groupname("Gang").users(users).build();
        user.setGroup(group);
        userService.save(user);
        groupService.save(group);

        UserDTO userDTO = UserDTOMapper.toDTO(user);
        GroupDTO groupDTO = GroupDTOMapper.toDTO(group);

        Timeslot t = Timeslot.builder()
                .description("t")
                .startDateTime(LocalDateTime.now())
                .endDateTime(LocalDateTime.now().plusHours(1))
                .build();


        System.out.println(userDTO);
        System.out.println(groupDTO);

    }

}
