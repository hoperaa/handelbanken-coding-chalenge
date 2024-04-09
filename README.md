# handelbanke-coding-chalenge

## Project organization

| Package names | Description                                                                                                                                |
|---------------|--------------------------------------------------------------------------------------------------------------------------------------------|
| api           | layer without business rules & knowledge: application services               |
| app           | envelops all other layers and produces a deployable package (JAR/WAR)                                            |
| core          | domain layer with business rules & knowledge: root aggregates, entities, repositories, domain services etc.                 |
| infra         | connects to db                        |
| infra-api     | serves as an entry point to the architecture; provides REST APIs, etc.; implements jobs;|
