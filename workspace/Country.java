public class Country
{
  // add private instance variables for the name, capital, language, and image file.

  // add constructors

  // Write accessor/get methods for each instance variable that returns it.

  // Write a toString() method that returns a concatenated String of 3 of the instance variables in a sentence like "..'s capital is .. and its primary language is ..."
 
  private String name;
  private String capital;
  private String language;
  private String image;

  public Country(String n, String cap, String lang, String img) {
    name = n;
    capital = cap;
    language = lang;
    image = img;
  }

  public String getName() {
    return name;
  }

  public String getCapital() {
    return capital;
  }

  public String getLanguage() {
    return language;
  }

  public String getImage() {
    return image;
  }

  public String toString() {
    return name + "'s capital is " + capital + " and it's primary language is " + language;
  }

}