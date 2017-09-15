insert into skills (id, difficulty, name, description) values (1000,1, "command","<i>Tell</i> people to fight.");
insert into skills (id, difficulty, name, description) values (1001,2, "fight","Actually <i>fight</i>.");

insert into actors (id, name, class_name, description) values (1002,"test class", "Commander","Head gadgie");
insert into actors (id, name, class_name, description) values (1003,"test class2", "Bishop","What would Dworkin do?  No, not <i>Andrea</i> Dworkin: the <i>other</i> unlikeable one.");
insert into actors (id, name, class_name, description) values (1004,"test class3", "Soldier","Part-time murderer.");
insert into actors (id, name, class_name, description) values (1005,"test class3", "Peasant","Soon-to-be ex-peasant.");

insert into skills_allowed_actors (allowed_skills_id, allowed_actors_id) values (1000, 1002);
insert into skills_allowed_actors (allowed_skills_id, allowed_actors_id) values (1000, 1003);
insert into skills_allowed_actors (allowed_skills_id, allowed_actors_id) values (1001, 1002);
insert into skills_allowed_actors (allowed_skills_id, allowed_actors_id) values (1001, 1004);

INSERT INTO  training_list (id,actor_id,skill_id) VALUES(1,2000,1000);
INSERT INTO  training_list (id,actor_id,skill_id) VALUES(2,2000,1001);
INSERT INTO  training_list (id,actor_id,skill_id) VALUES(3,2001,1000);