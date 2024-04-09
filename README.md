# handelbanke-coding-chalenge

## Project organization

| Package names | Description                                                                                                                               |
|---------------|-------------------------------------------------------------------------------------------------------------------------------------------|
| api           | layer without business rules & knowledge: application services               |
| app           | envelops all other layers and produces a deployable package (JAR/WAR)                                           |
| core          | domain layer with business rules & knowledge: root aggregates, entities                |
| infra         | connects to db                        |
| infra-api     | serves as an entry point to the architecture; provides REST APIs, etc.; implements jobs;|


## Improvements

For purposes of expanding the rest endpoint create:

- Mapper for converting dto object to entity objects
- Add more unit test
- Make integrtaion tests
- If number of endpoints grow then make
- Adding authorisation for endpoints

## Improvements for developers

- Make application can be run locally with docker
- DB credentials to a secrets file 