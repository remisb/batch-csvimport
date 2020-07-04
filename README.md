# batch-csvimport

Demo Spring Batch project. Code is based on [Spring Guides - Creating a Batch Service](https://spring.io/guides/gs/batch-processing/) and blog post ["Creating a batch service"](https://blog.marcosbarbero.com/creating-a-batch-service/).

Batch process description and steps:

- on application startup, mysql db schema will be updated by adding person table to batch database.
- read content of the hardcoded csv file and extract Person and salary data from provided data file
- increase salary by 10 percent and round it
- data will stored into mysql database batch.person table