/* Generating account classification entries */

insert into account_type values (1,'current');
insert into account_type values (2,'savings');
insert into account_type values (3,'salary');
insert into account_type values (4,'FD Account');
insert into account_type values (5,'RD Account');
insert into account_type values (6,'NRI Account');

/* Generating Transaction classification entries */

insert into transacation_type values (1,'Credit');
insert into transacation_type values (2,'Debit');

/* Generating Customer entries */

insert into customer values (1,'vinothpandian');
insert into customer values (2,'vinoth');
insert into customer values (3,'pandian');
insert into customer values (4,'pandi');
insert into customer values (5,'vinothpandi');

/* Generating account entries */

insert into account values (1,1000000,1,1);
insert into account values (2,2000000,2,2);
insert into account values (3,3000000,3,3);
insert into account values (4,4000000,4,4);
insert into account values (5,5000000,5,5);