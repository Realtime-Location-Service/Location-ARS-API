# Location-ARS-API

Location-ARS-API is used for providing an unified querying api for location pings and extra data related to live location pings.

#### Suggested query patterns (Mimics Location-MetaData-API)
 - Match: 
    -  Json: `["match": {"name": "mofiz", "city": ["Dhaka", "Khulna"]}]`
    -  `name`/`city` refers to `key` in saved JSON.
    -  value can be either single value or array.
    -  Execute query based on match.
 - Except: 
    -  Json: `["except": {"name": "abul", "city": ["Chittagong", "Sylhet"]}]`
    -  Structure same as `match`.
    -  Execute query as NOT.
 - Range: 
    -  JSON: `["range": {"age": {"lt": 42, "gt": 42}]`
    -  `age` refers to `key` saved in JSON.
    -  Support `lt`/`lte`/`gt`/`gte` operators.
##### Extra fields
 - Distance: 
    -  JSON: 
        ````
            ["distance": {
                "point": {
                    "lt": 42, 
                    "gt": 42,
                    "lat": 34.435,
                    "long": 67.4545,
                    "unit": "km"
                },
                "person/user": {
                    "lt": 42, 
                    "gt": 42,
                    "id": 44523523,
                    "unit": "km"
                }
            ]
        ````
        -   Provide either `point` or `person/user`. (If both are provided use `point`)
        -   Support for `lt`/`lte`/`gt`/`gte`.
        -   Support for unit `km`/`mile`.
        -   Filter users based on distance.
       
