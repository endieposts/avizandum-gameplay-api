insert into skills (id, difficulty, name, description) values (1000,1, 'command','<i>Tell</i> people to fight.');
insert into skills (id, difficulty, name, description) values (1001,2, 'fight','Actually <i>fight</i>.');

insert into actor_types (id, name, class_name, description) values (1002,'test class', 'Commander','Head gadgie');
insert into actor_types (id, name, class_name, description) values (1003,'test class2', 'Bishop','What would Dworkin do?  No, not <i>Andrea</i> Dworkin: the <i>other</i> unlikeable one.');
insert into actor_types (id, name, class_name, description) values (1004,'test class3', 'Soldier','Part-time murderer.');
insert into actor_types (id, name, class_name, description) values (1005,'test class4', 'Peasant','Soon-to-be ex-peasant.');

insert into skills_allowed_actor_types (allowed_skills_id, allowed_actor_types_id) values (1000, 1002);
insert into skills_allowed_actor_types (allowed_skills_id, allowed_actor_types_id) values (1000, 1003);
insert into skills_allowed_actor_types (allowed_skills_id, allowed_actor_types_id) values (1001, 1002);
insert into skills_allowed_actor_types (allowed_skills_id, allowed_actor_types_id) values (1001, 1004);

insert into actors (id, name) values (2000, 'Beavis');
insert into actors (id, name) values (2001, 'Butthead');

INSERT INTO  training_list (id, train_order, actor_id,skill_id) VALUES(1, 2, 2000,1000);
INSERT INTO  training_list (id, train_order, actor_id,skill_id) VALUES(2, 1, 2000,1001);
INSERT INTO  training_list (id, train_order, actor_id,skill_id) VALUES(3, 1, 2001,1000);