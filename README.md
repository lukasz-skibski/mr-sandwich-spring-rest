# PanKanapka

### Get auth token
```
curl --request POST --url 'https://spuu.eu.auth0.com/oauth/token' --header 'content-type: application/json' --data '{"grant_type":"password", "scope":"openid", "username":"test@mundanemeatballs.com", "password":"test", "audience":"https://spuu.eu.auth0.com/api/v2/", "client_id": "qmbg6IoSjSOSmn9kI3hQaSFFXh5UfuXl", "client_secret": "Zdmvp9iBOiXQkfJFAvHVeJche0c5diqwOZmts50575c2jnUaazm9IufyZJuMjGNc"}'
```

### Run endpoint
```
curl -X GET -H "Authorization: Bearer _access_token_" -H "Cache-Control: no-cache" "http://localhost:8080/api/categories"
```

### Set up postgres
```
sudo -u postgres createuser --interactive $USER
sudo -u postgres createdb mrsandwich
psql -d mrsandwich
ALTER USER postgres with password 'postgres@321';
```
