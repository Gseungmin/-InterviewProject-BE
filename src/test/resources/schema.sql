-- 임베디드 DB 사용을 위한 기본 테이블 생성
drop table if exists orders CASCADE;
create table orders (
                        order_id bigint not null,
                        email varchar(255),
                        order_date varchar(255),
                        phone_number varchar(255),
                        username varchar(255),
                        primary key (order_id)
) engine=InnoDB