# spring data rest sample
This example provides a sample usage of spring data rest with spring boot. spring data rest framework
comes with default hateoas in to your response



Currently has the following resource endpoints

[Get available customers](http://localhost:8080/customers)
`http://localhost:8080/customers`
 Response
 ```json
{
"_embedded": {
    "customers": [
    {
    "firstName": "Ryan",
    "lastName": "Adam",
    "_links": {
    "self": {
         "href": "http://localhost:8080/customers/1"
    },
    "customer": {
         "href": "http://localhost:8080/customers/1"
    }
    }
    },
    {
    "firstName": "Tom",
    "lastName": "Ross",
    "_links": {
    "self": {
        "href": "http://localhost:8080/customers/2"
    },
    "customer": {
        "href": "http://localhost:8080/customers/2"
    }
    }
    }
    ]
    },
    "_links": {
    "self": {
    "href": "http://localhost:8080/customers"
    },
    "profile": {
        "href": "http://localhost:8080/profile/customers"
    },
    "search": {
        "href": "http://localhost:8080/customers/search"
    }
    },
    "page": {
    "size": 20,
    "totalElements": 2,
    "totalPages": 1,
    "number": 0
    }
}
```

###Build Details###
spring-data-rest(https://travis-ci.org/nbenjamin/spring-data-rest/builds)

 

