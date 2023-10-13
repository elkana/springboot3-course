
INSERT INTO office(OFFICE_CODE, BRANCH_NAME)
values 
  ('A0001', 'PT. Elang Sejahtera');
  
INSERT INTO MC_MST_USERS (empl_branch, user_type, user_id, coll_name, coll_nik, email_addr, encrypted_pwd, created_timestamp) VALUES
  ('A0001', 'ADM', 'elkana911', 'Eric Elkana 911', '3603281109770003', 'elkana911@yahoo.com', 'dbde0e2da3e90265d06cb70e1cb701c0', CURRENT_TIMESTAMP),
  ('A0001', 'ADM', 'ellkana','Ellkana Eric', '3603281109770004', 'ellkana@gmail.com', null, CURRENT_TIMESTAMP);
