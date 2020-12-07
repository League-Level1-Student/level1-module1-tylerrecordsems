package _06_duck;

public class Duck {
int numberOfFriends;
String favoriteFood;
void quack() {
	System.out.println("QUAK!!!!!");
}
void wattle() {
	System.out.println("And he wattled away, then he wattled away,  Till the very next day bum bum bum.");
}

Duck(String favoriteFood, int numberOfFriends) {
       this.favoriteFood = favoriteFood;
       this.numberOfFriends = numberOfFriends;
}
}
