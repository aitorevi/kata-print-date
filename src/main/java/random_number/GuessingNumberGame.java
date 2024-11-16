package random_number;

public class GuessingNumberGame {

  private final int randomNumber;

  GuessingNumberGame(RandomNumberGenerator generator){
    this.randomNumber = generator.randomNumber();
  }
}
