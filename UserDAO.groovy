import groovy.sql.Sql
import User

class UserDAO {
	private username,password,email,age;
ArrayList users
Sql sql
public UserDAO(){
users=new ArrayList()
println "user db constructor"
sql = Sql.newInstance("jdbc:mysql://localhost:3306/test", "root","higgins", "com.mysql.jdbc.Driver")
 
sql.eachRow("select * from user") {
 
  username=it.username
  password=it.password
  email=it.email
  age=it.age
  User p=new User(username,password,email,age)
//def p=new User("Bob","xyz","email","55")
 users.add(p)
 
 
 }
}//constructor
 
  ArrayList list() {
        return users
    }
}//class