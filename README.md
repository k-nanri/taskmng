# README

## PostgreSQLの準備

# ストレージを用意する場合
$ docker run --rm --name pg-docker -e POSTGRES_PASSWORD=postgres -d -p 5432:5432 -v $PWD/vols:/var/lib/postgresql/data postgres

# ストレージを用意しない場合
# $ docker run --rm --name pg-docker -e POSTGRES_PASSWORD=postgres -d -p 5432:5432 postgres

コンテナの起動を確認
```
$ docker ps
```

コンテナ名でコンテナにshellで接続
```
$ docker container exec -it pg-docker /bin/bash
# su - postgres
$ psql -U postgres
# CREATE DATABASE taskmng ENCODING = 'UTF8';
```

CREATE TABLE TASK (
  title varchar(30),
  detail varchar(300),
  progress int,
  starttime timestamp ,
  endtime timestamp 
);

## REST
{
"title" : "hoge",
"detail": "de",
"progress": 0,
"start_date": "2021-03-01T00:00:00",
"end_date" : "2021-03-02T00:00:00"
}

## ZonedDateTimeクラスを使用するとエラーになる。

MyBatisでZonedDateTimeクラスを使用すると以下のエラーが発生する。
「org.postgresql.util.PSQLException: java.time.ZonedDateTime のインスタンスに対して使うべきSQL型を推測できません。明示的な Types 引数をとる setObject() で使うべき型を指定してください。」

https://jdbc.postgresql.org/documentation/head/8-date-time.html

PostgreSQLはサポートしてないようなので、Javaで変換が必要。

