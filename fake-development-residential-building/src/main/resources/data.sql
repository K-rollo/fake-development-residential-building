insert into client(id, first_name, last_name, street, number_as_string, city, zip_code_as_string, phone_number_as_string, email_address_as_string)
values (1, 'Grzegorz','Bak', 'Pokojowa', '23/6', 'Nibygrod', '12-543', '023-067-234', 'grzegorz.bak@fake.fk');

insert into client(id, first_name, last_name, street, number_as_string, city, zip_code_as_string, phone_number_as_string, email_address_as_string)
values (2, 'Karol','Kania','Glebocka','9B/5','Warszawa','03-287','607-111-014','karolkania@wp.pl');

insert into client(id, first_name, last_name, street, number_as_string, city, zip_code_as_string, phone_number_as_string, email_address_as_string)
values (3, 'Marianna', 'Kania', 'Pospolita', '102/1', 'Warszawa', '05-287', '123-321-123', 'mariannakania@fake.fk');



insert into apartment(id, building, staircase, floor, apartment_number, apartment_area, amount_of_rooms, status, client_id)
values (1, 'A', '1', 1, 1, 57.23, 3, 'available', null);


insert into apartment(id, building, staircase, floor, apartment_number, apartment_area, amount_of_rooms, status, client_id)
values (2, 'A', '1', 2, 2, 80.45, 4, 'available', null);

insert into apartment(id, building, staircase, floor, apartment_number, apartment_area, amount_of_rooms, status, client_id)
values (3, 'A', '1', 3, 3, 32.50, 1, 'available', null);

insert into apartment(id, building, staircase, floor, apartment_number, apartment_area, amount_of_rooms, status, client_id)
values (4, 'B', '1', 1, 4, 34.12, 1, 'booked', 1);

insert into apartment(id, building, staircase, floor, apartment_number, apartment_area, amount_of_rooms, status, client_id)
values (5, 'B', '1', 2, 5, 103.20, 4, 'available', null);

insert into apartment(id, building, staircase, floor, apartment_number, apartment_area, amount_of_rooms, status, client_id)
values (6, 'B', '1', 3, 6, 44.43, 2, 'sold', 2);

insert into ap_action (id, apartment_id, action_type, client_id, created)
values (1, 1, 'Booked', 1, '2020-12-30 13:08:54.193');

insert into ap_action (id, apartment_id, action_type, client_id, created)
values (2, 1, 'Sold', 1, '2020-12-31 13:08:54.193');