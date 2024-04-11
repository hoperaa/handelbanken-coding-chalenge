create table watch (discount_amount float(53), discount_for_pieces integer not null, price float(53), watch_id varchar(255) not null, watch_name varchar(255), primary key (watch_id));
INSERT INTO watch (watch_id,watch_name,price,discount_for_pieces,discount_amount) VALUES ('001','Rolex',100.00,3,200.00);
INSERT INTO watch (watch_id,watch_name,price,discount_for_pieces,discount_amount) VALUES ('002','Michal Kors',80.00,2,120.00);
INSERT INTO watch (watch_id,watch_name,price,discount_for_pieces,discount_amount) VALUES ('003','Swatch',50.00,0,0.00);
INSERT INTO watch (watch_id,watch_name,price,discount_for_pieces,discount_amount) VALUES ('004','Casio',30.00,0,0.00);

