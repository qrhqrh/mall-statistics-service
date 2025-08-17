```shell
mysqldump -h 127.0.0.1 -P 3306 -uroot -proot --no-create-info --skip-triggers --compact mall_statistics > mall_statistics_data.sql
```

```shell
mysqldump -h 127.0.0.1 -P 3306 -uroot -proot --no-data --skip-triggers --skip-routines mall_statistics > mall_statistics_schema_only.sql
```