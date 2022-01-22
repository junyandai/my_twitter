# Restful API

## Routes:

- ## user

### Create a new account

- Request :
  
  - Endpoint : **POST** user/register
  - Headers : Content- Type:application/json
  - Body:

```
{
	"name" : "Bob",
	"password" : "Bob1234"

}
```

- Sample Response :
  
  ```
  {
  	"user_id" = 123456
  }
  ```

### User Look Up

Find all users with the name

- Request :
  - Endpoint : **GET** user/by/username/:username
  - Headers : Content- Type:application/json
  - Path Variable :
    - username : string 


- Sample Response
  
  ```
  {
  	"data": [
  		{	"user_id" : "123456",
  			"user_name" : "Bob"
  			}, 
  
  		{
  			"user_id" : 1111111",
  			"user_name" : Bob"
  			} 
  	]
  
  }
  ```

### Change User's Password

If the user input the correct "user_old_password" and input same "user_new_password" and "user_new_password_again", then it will return with code 200 and the message to tell the user this reset sucessfully.

- Request :
  
  - Endpoint : **PUT** /:id/change-password
  - Headers : Content- Type:application/json
  - Path Variabble :
    - id : integer
  - Body:

```
{
	"user_name" : "Bob"
	"user_old_password" : "Bob123",
	"user_new_password" : "Bob456",
	"user_new_password_again" : "Bob456"

}
```

- Sample Response
  
  ```
  {
  	"status" : 200
  	"message" : "You have already reset your password successfully"
  
  }
  ```
- ## Tweets

### Tweets Look up

Retrieve a tweet by id

- Request :
  
  - Endpoint : **GET** /tweets/:id
  - Headers : Content- Type:application/json
  - Path Variable :
    - id : integer
- Sample Response :
  
  ```
  {
  	"data": {
  		"author_id" : "123456",
  		"status" : 200,
  		"title" : "Who Am I",
  		"id" : "2412314214135353",
  		"text": Hello, I am Bob."
  
    		}
  
  }
  ```
  
  ### Write a Tweet
- Request :
  
  - Endpoint : /tweets
  - Headers : Content- Type:application/json
  - Body :
    ```
    {
    	"title" : "Who Am I",
    	"text" : "I am Bob"
    
    }
    ```
- Sample Response :
  
  ```
  {
  	"id" : 1324242
  
  }
  ```
  
  ### Delete a Tweet
- Request :
  
  - Endpoint : tweets/:id
  - Headers : Content- Type:application/json
- Sample Response :
  
  ```
  {
  	"status" : 200
  
  }
  ```
- ## Follows

### Follows Look up

Find all follows of a user

- Request :
  
  - Endpoint : **GET** /user/:id/following
  - Headers : Content- Type:application/json
  - Path Variable :
    - id  : integer
  - Sample Response :
    ```
    {
    	"data" : [
    		{"name" : "Bob", "id" : "123456 }
    
    
    	]
    
    
    }
    ```
  
  ### Follow a User
- Request :
  
  - Endpoint : **POST** /user/:id/following
  - Headers : Content- Type:application/json
  - Path Variable :
    
    - id : integer
  - Body
    
    ```
    {
    	"id" = 123456
    
    }
    ```
  - Sample Response :
    
    ```
    {
    	"status" : 200
    
    }
    ```
  
  ### Unfollow a User
- Endpoint : **DELETE** /user/:source-id/following/:target-id
- Headers : Content- Type:application/json
- Variable Parameter :
  
  - source_id : integer
  - target_id : integer
- Body :
  
  ```
  {
  	"user_id" : "123456"  
  }
  ```
- Sample Response
  
  ```
  {
  	"status" : 200
  
  }
  ```
- ## Comments

### Look up a Comment of a user for a specific tweet

- Endpoint : **GET** /comments/:id/
- Headers : Content- Type:application/json
- Path Variable :
  
  - id : integer
- Sample Respnse
  
  ```
  {
  	"author" : "Bob", 
  	"text" : "LoL."
  
  }
  ```

### Write a Comment

- Endpoint : **POST** /comments/
- Headers : Content- Type:application/json
- Path Variable :
  
  - id : integer
- Body
  
  ```
  {
  	"text" : "Hello, world"
  }
  ```
- Sample Response :
  
  ```
  {
  	"id" = 066669
  }
  ```

### Delete a Comment

- Endpoint : **DELETE** /comments/:id
- Headers : Content- Type:application/json
- Path Variable :
  - id : integer
- Sample Response :
  ```
  {
  	"status" : 200
  
  }
  ```
