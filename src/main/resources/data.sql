
INSERT INTO _user (id, username) VALUES (1, 'Jack');
INSERT INTO _user (id, username) VALUES (2, 'Magic');
INSERT INTO _user (id, username) VALUES (3, 'John');
INSERT INTO _user (id, username) VALUES (4, 'Alice');
INSERT INTO _user (id, username) VALUES (5, 'Test');
INSERT INTO _user (id, username) VALUES (6, 'Bob');
INSERT INTO _user (id, username) VALUES (7, 'Emily');
INSERT INTO _user (id, username) VALUES (8, 'Michael');
INSERT INTO _user (id, username) VALUES (9, 'Sophia');

INSERT INTO _group (id, groupname) VALUES (1, 'Gang');
INSERT INTO _user_group (user_id, group_id) VALUES (1,1);
INSERT INTO _user_group (user_id, group_id) VALUES (2,1);
INSERT INTO _user_group (user_id, group_id) VALUES (3,1);
INSERT INTO _user_group (user_id, group_id) VALUES (4,1);
INSERT INTO _user_group (user_id, group_id) VALUES (5,1);
INSERT INTO _user_group (user_id, group_id) VALUES (6,1);
INSERT INTO _user_group (user_id, group_id) VALUES (7,1);
INSERT INTO _user_group (user_id, group_id) VALUES (8,1);
INSERT INTO _user_group (user_id, group_id) VALUES (9,1);
INSERT INTO _rooster (id, start_date, end_date, group_id) VALUES (1, '2023-09-4', '2023-09-8', 1);
INSERT INTO _timeslot (id, description, start_date_time, end_date_time, rooster_id) VALUES (1, 'Breakfast', '2023-09-04 10:00:00.000000', '2023-09-04 12:00:00.000000', 1);
INSERT INTO _timeslot (id, description, start_date_time, end_date_time, rooster_id) VALUES (2, 'Dinner'   , '2023-09-04 17:00:00.000000', '2023-09-04 19:00:00.000000', 1);
INSERT INTO _timeslot (id, description, start_date_time, end_date_time, rooster_id) VALUES (3, 'Breakfast', '2023-09-05 09:00:00.000000', '2023-09-05 13:00:00.000000', 1);
INSERT INTO _timeslot (id, description, start_date_time, end_date_time, rooster_id) VALUES (4, 'Dinner'   , '2023-09-05 13:00:00.000000', '2023-09-05 19:00:00.000000', 1);

INSERT INTO _timeslot (id, description, start_date_time, end_date_time, rooster_id) VALUES ( 90, 'Breakfast', '2023-09-06 09:00:00.000000', '2023-09-06 11:00:00.000000', 1);
INSERT INTO _timeslot (id, description, start_date_time, end_date_time, rooster_id) VALUES (5, 'Breakfast', '2023-09-06 10:00:00.000000', '2023-09-06 13:00:00.000000', 1);
INSERT INTO _timeslot (id, description, start_date_time, end_date_time, rooster_id) VALUES (91, 'Breakfast', '2023-09-06 11:00:00.000000', '2023-09-06 14:00:00.000000', 1);

INSERT INTO _timeslot (id, description, start_date_time, end_date_time, rooster_id) VALUES (6, 'Dinner'   , '2023-09-06 17:00:00.000000', '2023-09-06 19:00:00.000000', 1);
INSERT INTO _timeslot (id, description, start_date_time, end_date_time, rooster_id) VALUES (7, 'Breakfast', '2023-09-07 10:00:00.000000', '2023-09-07 11:00:00.000000', 1);
INSERT INTO _timeslot (id, description, start_date_time, end_date_time, rooster_id) VALUES (8, 'Dinner'   , '2023-09-07 18:00:00.000000', '2023-09-07 19:00:00.000000', 1);
INSERT INTO _timeslot (id, description, start_date_time, end_date_time, rooster_id) VALUES (9, 'Breakfast', '2023-09-08 08:00:00.000000', '2023-09-08 11:00:00.000000', 1);
INSERT INTO _timeslot (id, description, start_date_time, end_date_time, rooster_id) VALUES (10, 'Dinner'  , '2023-09-08 11:00:00.000000', '2023-09-08 21:00:00.000000', 1);
INSERT INTO _timeslot (id, description, start_date_time, end_date_time, rooster_id) VALUES (92, 'Dinner'  , '2023-09-08 14:00:00.000000', '2023-09-08 18:00:00.000000', 1);

INSERT INTO _rooster (id, start_date, end_date, group_id) VALUES (2, '2023-08-28', '2023-09-1', 1);
INSERT INTO _timeslot (id, description, start_date_time, end_date_time, rooster_id) VALUES (11, 'Breakfast', '2023-08-28 10:00:00.000000', '2023-08-28 12:00:00.000000', 2);
INSERT INTO _timeslot (id, description, start_date_time, end_date_time, rooster_id) VALUES (12, 'Dinner'   , '2023-08-28 18:00:00.000000', '2023-08-28 20:00:00.000000', 2);
INSERT INTO _timeslot (id, description, start_date_time, end_date_time, rooster_id) VALUES (13, 'Breakfast', '2023-08-29 10:00:00.000000', '2023-08-29 12:00:00.000000', 2);
INSERT INTO _timeslot (id, description, start_date_time, end_date_time, rooster_id) VALUES (14, 'Dinner'   , '2023-08-29 18:00:00.000000', '2023-08-29 20:00:00.000000', 2);
INSERT INTO _timeslot (id, description, start_date_time, end_date_time, rooster_id) VALUES (15, 'Breakfast', '2023-08-30 10:00:00.000000', '2023-08-30 12:00:00.000000', 2);
INSERT INTO _timeslot (id, description, start_date_time, end_date_time, rooster_id) VALUES (16, 'Dinner'   , '2023-08-30 18:00:00.000000', '2023-08-30 20:00:00.000000', 2);
INSERT INTO _timeslot (id, description, start_date_time, end_date_time, rooster_id) VALUES (17, 'Breakfast', '2023-08-31 10:00:00.000000', '2023-08-31 12:00:00.000000', 2);
INSERT INTO _timeslot (id, description, start_date_time, end_date_time, rooster_id) VALUES (18, 'Dinner'   , '2023-08-31 18:00:00.000000', '2023-08-31 20:00:00.000000', 2);
INSERT INTO _timeslot (id, description, start_date_time, end_date_time, rooster_id) VALUES (19, 'Breakfast', '2023-09-01 10:00:00.000000', '2023-09-01 12:00:00.000000', 2);
INSERT INTO _timeslot (id, description, start_date_time, end_date_time, rooster_id) VALUES (20, 'Dinner'   , '2023-09-01 18:00:00.000000', '2023-09-01 20:00:00.000000', 2);

INSERT INTO _rooster (id, start_date, end_date, group_id) VALUES (3, '2023-08-21', '2023-08-25', 1);
INSERT INTO _timeslot (id, description, start_date_time, end_date_time, rooster_id) VALUES (31, 'Breakfast', '2023-08-21 10:00:00.000000', '2023-08-21 12:00:00.000000', 3);
INSERT INTO _timeslot (id, description, start_date_time, end_date_time, rooster_id) VALUES (32, 'Dinner'   , '2023-08-21 18:00:00.000000', '2023-08-21 20:00:00.000000', 3);
INSERT INTO _timeslot (id, description, start_date_time, end_date_time, rooster_id) VALUES (33, 'Breakfast', '2023-08-22 10:00:00.000000', '2023-08-22 12:00:00.000000', 3);
INSERT INTO _timeslot (id, description, start_date_time, end_date_time, rooster_id) VALUES (34, 'Dinner'   , '2023-08-22 18:00:00.000000', '2023-08-22 20:00:00.000000', 3);
INSERT INTO _timeslot (id, description, start_date_time, end_date_time, rooster_id) VALUES (35, 'Breakfast', '2023-08-23 10:00:00.000000', '2023-08-23 12:00:00.000000', 3);
INSERT INTO _timeslot (id, description, start_date_time, end_date_time, rooster_id) VALUES (36, 'Dinner'   , '2023-08-23 18:00:00.000000', '2023-08-23 20:00:00.000000', 3);
INSERT INTO _timeslot (id, description, start_date_time, end_date_time, rooster_id) VALUES (37, 'Breakfast', '2023-08-24 10:00:00.000000', '2023-08-24 12:00:00.000000', 3);
INSERT INTO _timeslot (id, description, start_date_time, end_date_time, rooster_id) VALUES (38, 'Dinner'   , '2023-08-24 18:00:00.000000', '2023-08-24 20:00:00.000000', 3);
INSERT INTO _timeslot (id, description, start_date_time, end_date_time, rooster_id) VALUES (39, 'Breakfast', '2023-08-25 10:00:00.000000', '2023-08-25 12:00:00.000000', 3);
INSERT INTO _timeslot (id, description, start_date_time, end_date_time, rooster_id) VALUES (40, 'Dinner'   , '2023-08-25 18:00:00.000000', '2023-08-25 20:00:00.000000', 3);

INSERT INTO _rooster (id, start_date, end_date, group_id) VALUES (4, '2023-09-21', '2023-09-25', 1);
INSERT INTO _timeslot (id, description, start_date_time, end_date_time, rooster_id) VALUES (41, 'Breakfast', '2023-09-21 10:00:00.000000', '2023-09-21 14:00:00.000000', 4);
INSERT INTO _timeslot (id, description, start_date_time, end_date_time, rooster_id) VALUES (42, 'Dinner'   , '2023-09-21 17:00:00.000000', '2023-09-21 20:00:00.000000', 4);
INSERT INTO _timeslot (id, description, start_date_time, end_date_time, rooster_id) VALUES (43, 'Breakfast', '2023-09-22 10:00:00.000000', '2023-09-22 12:00:00.000000', 4);
INSERT INTO _timeslot (id, description, start_date_time, end_date_time, rooster_id) VALUES (44, 'Dinner'   , '2023-09-22 19:00:00.000000', '2023-09-22 20:00:00.000000', 4);
INSERT INTO _timeslot (id, description, start_date_time, end_date_time, rooster_id) VALUES (45, 'Breakfast', '2023-09-23 10:00:00.000000', '2023-09-23 12:00:00.000000', 4);
INSERT INTO _timeslot (id, description, start_date_time, end_date_time, rooster_id) VALUES (46, 'Dinner'   , '2023-09-23 18:00:00.000000', '2023-09-23 21:00:00.000000', 4);
INSERT INTO _timeslot (id, description, start_date_time, end_date_time, rooster_id) VALUES (49, 'Breakfast', '2023-09-25 10:00:00.000000', '2023-09-25 12:00:00.000000', 4);
INSERT INTO _timeslot (id, description, start_date_time, end_date_time, rooster_id) VALUES (50, 'Dinner'   , '2023-09-25 18:00:00.000000', '2023-09-25 20:00:00.000000', 4);


INSERT INTO _rooster (id, start_date, end_date, group_id) VALUES (5, '2023-09-09', '2023-09-10', 1);
INSERT INTO _timeslot (id, description, start_date_time, end_date_time, chosen_user_id, rooster_id) VALUES (51, 'Breakfast', '2023-09-09 10:00:00.000000', '2023-09-09 14:00:00.000000', 1, 5);
INSERT INTO _timeslot (id, description, start_date_time, end_date_time, chosen_user_id, rooster_id) VALUES (52, 'Dinner'   , '2023-09-09 17:00:00.000000', '2023-09-09 20:00:00.000000', 2, 5);
INSERT INTO _timeslot (id, description, start_date_time, end_date_time, chosen_user_id, rooster_id) VALUES (53, 'Breakfast', '2023-09-10 10:00:00.000000', '2023-09-10 12:00:00.000000', 1, 5);
INSERT INTO _timeslot (id, description, start_date_time, end_date_time, rooster_id)                 VALUES (54, 'Dinner'   , '2023-09-10 19:00:00.000000', '2023-09-10 20:00:00.000000',    5);


INSERT INTO _user_timeslot (user_id, timeslot_id) VALUES (1,1);
INSERT INTO _user_timeslot (user_id, timeslot_id) VALUES (1,2);
INSERT INTO _user_timeslot (user_id, timeslot_id) VALUES (1,3);
INSERT INTO _user_timeslot (user_id, timeslot_id) VALUES (1,4);
INSERT INTO _user_timeslot (user_id, timeslot_id) VALUES (1,5);
INSERT INTO _user_timeslot (user_id, timeslot_id) VALUES (1,6);
INSERT INTO _user_timeslot (user_id, timeslot_id) VALUES (1,7);
INSERT INTO _user_timeslot (user_id, timeslot_id) VALUES (1,9);
INSERT INTO _user_timeslot (user_id, timeslot_id) VALUES (1,10);
INSERT INTO _user_timeslot (user_id, timeslot_id) VALUES (2,1);
INSERT INTO _user_timeslot (user_id, timeslot_id) VALUES (2,4);
INSERT INTO _user_timeslot (user_id, timeslot_id) VALUES (2,5);
INSERT INTO _user_timeslot (user_id, timeslot_id) VALUES (2,6);
INSERT INTO _user_timeslot (user_id, timeslot_id) VALUES (2,7);
INSERT INTO _user_timeslot (user_id, timeslot_id) VALUES (2,10);

INSERT INTO _user_timeslot (user_id, timeslot_id) VALUES (1, 54);
INSERT INTO _user_timeslot (user_id, timeslot_id) VALUES (2, 54);
INSERT INTO _user_timeslot (user_id, timeslot_id) VALUES (3, 54);
INSERT INTO _user_timeslot (user_id, timeslot_id) VALUES (4, 54);
INSERT INTO _user_timeslot (user_id, timeslot_id) VALUES (5, 54);
INSERT INTO _user_timeslot (user_id, timeslot_id) VALUES (6, 54);
INSERT INTO _user_timeslot (user_id, timeslot_id) VALUES (7, 54);
INSERT INTO _user_timeslot (user_id, timeslot_id) VALUES (8, 54);
INSERT INTO _user_timeslot (user_id, timeslot_id) VALUES (9, 54);

INSERT INTO _user_timeslot (user_id, timeslot_id) VALUES (1, 8);
INSERT INTO _user_timeslot (user_id, timeslot_id) VALUES (2, 8);
INSERT INTO _user_timeslot (user_id, timeslot_id) VALUES (3, 8);
INSERT INTO _user_timeslot (user_id, timeslot_id) VALUES (4, 8);
INSERT INTO _user_timeslot (user_id, timeslot_id) VALUES (5, 8);
INSERT INTO _user_timeslot (user_id, timeslot_id) VALUES (6, 8);
INSERT INTO _user_timeslot (user_id, timeslot_id) VALUES (7, 8);
INSERT INTO _user_timeslot (user_id, timeslot_id) VALUES (8, 8);
INSERT INTO _user_timeslot (user_id, timeslot_id) VALUES (9, 8);