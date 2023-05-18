package com.example.permanentie.services;

import com.example.permanentie.models.Group;
import com.example.permanentie.repos.GroupRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GroupService {

    private GroupRepo groupRepo;

    public void save(Group group) {
        groupRepo.save(group);
    }
}
