# handelbanke-coding-chalenge

## Project organization

| Package names | Description                                                                              |
|---------------|------------------------------------------------------------------------------------------|
| api           | layer without business rules & knowledge: application services                           | |
| model         | domain layer with business rules & knowledge: root aggregates, entities                  |
| repository    | connects to db                                                                           |
| infraApi      | serves as an entry point to the architecture; provides REST APIs, DTOs; implements jobs; |


## Improvements

For purposes of expanding the rest endpoint create:

- Mapper for converting dto object to entity objects
- Add more unit test
- Make integration tests
- Adding authorisation for endpoints

## Improvements for developers

- Make application can be run locally with docker