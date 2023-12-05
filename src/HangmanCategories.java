public class HangmanCategories {
    public int option;

    String clue;
    String word;
    String[] categoryChoice;

    public HangmanCategories() {
        option = (int) (Math.random() * 10);
    }

    public String[] getRandomWord(int choice) {
        this.option = (int) (Math.random() * 10);
        String[][] categories = {Sports(), Movies(), Computer(), Food(), Countries()};
        categoryChoice = categories[choice-1];
        return categoryChoice;
        //Will return an array of the random word and clue
    }

    public String[] Sports() {
        switch (option) {
            case 0: {
                clue = "An Argentenian Soccer Placer who plays for La Liga club FC Barcelona";
                word = "L I O N E L | M E S S I";
            }
            break;
            case 1: {
                clue = "Fist person to ever score 200 on ODI's";
                word = "S A C H I N | T E N D U L K A R";
            }
            break;
            case 2: {
                clue = "It is a South-Asian Team Sport";
                word = "K A B A D D I";
            }
            break;
            case 3: {
                clue = "It is a two-player Board Game";
                word = "C H E S S";
            }
            break;
            case 4: {
                clue = "It is a team sport in which two teams of six are separated by a net";
                word = "V O L L Y B A L L";
            }
            break;
            case 5: {
                clue = "Known as 'The Wall' in Cricket";
                word = "R A H U L | D R A V I D";
            }
            break;
            case 6: {
                clue = "World Table Tennis Champion";
                word = "M A | L O N G";
            }
            break;
            case 7: {
                clue = "A Famous Sport";
                word = "F O O T B A L L";
            }
            break;
            case 8: {
                clue = "Played on a hard board divided by a net";
                word = "T A B L E | T E N N I S";
            }
            break;
            case 9: {
                clue = "Indian Grandmaster of Chess";
                word = "V I S W A N A T H A N | A N A N D";
            }
            break;
        }
        return new String[]{word, clue};
    }

    public String[] Movies() {
        option = (int) (Math.random() * 10);
        switch (option) {
            case 0: {
                clue = "Movie in which Michael Jordan and famous Basketball Players were in";
                word = "S P A C E | J A M";
            }
            break;
            case 1: {
                clue = "It is a 2012 Indian satirical comedy film that satires organised religion and is directed by Omesh Shukla";
                word = "O H | M Y | G O D";
            }
            break;
            case 2: {
                clue = "Schwarzenegger plays the role of a cyborg assassin that is sent back in time to kill Sarah, a waitress, in a bid to stop her son who will wage a long war against his enemy in the future";
                word = "T H E | T E R M I N A T O R";
            }
            break;
            case 3: {
                clue = "It is a movie where 2 kids become spies";
                word = "S P Y | K I D S";
            }
            break;
            case 4: {
                clue = "An American action spy film both based on and a follow-on from the television series of the same name created by Bruce Geller. The series is co-produced by and stars Tom Cruise";
                word = "M I S S I O N | : | I M P O S S I B L E";
            }
            break;
            case 5: {
                clue = "Robert Downey Jr. stars in which 2019 film that sees the allies work together to fix the problems caused by Thanos?";
                word = "A V E N G E R S | : | E N D G A M E";
            }
            break;
            case 6: {
                clue = "A Disney media franchise that commenced in 1995 with the release of the animated feature film of the same name, produced by Pixar Animation Studios and released by Walt Disney Pictures";
                word = "T O Y | S T O R Y";
            }
            break;
            case 7: {
                clue = "This Film stars Macaulay Culkin as Kevin McCallister, an eight year old boy who is mistakenly left behind when his family leaves for France. At first, he is happy to be in charge, but when thieves try to break into his home, he tries to put up a fight";
                word = "H O M E | A L O N E";
            }
            break;
            case 8: {
                clue = "Dom and Brian travel from one country to another trying to throw the authorities off their scent. Now they have to bring their team together one more time while being chased by a federal agent";
                word = "F A S T | F I V E";
            }
            break;
            case 9: {
                clue = "This Film consists of many different superheros who form aliances and begin a mini-war";
                word = "C A P T A I N | A M E R I C A | : | C I V I L | W A R";
            }
            break;
        }
        return new String[]{word, clue};
    }

    public String[] Computer() {
        option = (int) (Math.random() * 10);
        switch (option) {
            case 0: {
                clue = "The brain of the Computer";
                word = "C E N T R A L | P R O C E S S I N G | U N I T";
            }
            break;
            case 1: {
                clue = "Stores a real world 2 Dimensional object in the form of a digital image";
                word = "S C A N N E R";
            }
            break;
            case 2: {
                clue = "A screen that displays output from a computer";
                word = "M O N I T O R";
            }
            break;
            case 3: {
                clue = "A Collection of 1024 bytes is _____________";
                word = "1 | K I L O B Y T E";
            }
            break;
            case 4: {
                clue = "It is what WWW stands for";
                word = "W O R L D | W I D E | W E B";
            }
            break;
            case 5: {
                clue = "It is an IDE for Java";
                word = "B L U E J";
            }
            break;
            case 6: {
                clue = "It is a software application that provides comprehensive facilities to computer programmers for software development";
                word = "I N T E G R A T E D | D E V E L O P M E N T | E N V I R O N M E N T";
            }
            break;
            case 7: {
                clue = "It is a temporary form of computer data storage";
                word = "R A N D O M | A C C E S S | M E M O R Y";
            }
            break;
            case 8: {
                clue = "It is a digital circuit that performs arithmetic and logical operations";
                word = "A R I T H M E T I C | A N D | L O G I C | U N I T";
            }
            break;
            case 9: {
                clue = "It is a network designed to allow communication within an organisation";
                word = "I N T R A N E T";
            }
            break;
        }
        return new String[]{word, clue};
    }

    public String[] Food() {
        option = (int) (Math.random() * 10);
        switch (option) {
            case 0: {
                clue = "It is an Indian food that is cited as Top Ten Tast";
                word = "M A S A L A | D O S A";
            }
            break;
            case 1: {
                clue = "A fruit that has that same name as it's colour";
                word = "O R A N G E";
            }
            break;
            case 2: {
                clue = "It is an oven-baked, flat, round bread typically topped with tomato sauce, cheese and various toppings";
                word = "P I Z Z A";
            }
            break;
            case 3: {
                clue = "It is a type of food made from unleavened dough which is rolled flat and cut into long strips or strings";
                word = "N O O D L E S";
            }
            break;
            case 4: {
                clue = "It is a tropical plant with an edible fruit, and the most economically significant plant in the family Bromeliaceae";
                word = "P I N E A P P L E";
            }
            break;
            case 5: {
                clue = "A bun between which a patty is kept";
                word = "B U R G E R";
            }
            break;
            case 6: {
                clue = "It is a type of chat";
                word = "P A N I | P U R I";
            }
            break;
            case 7: {
                clue = "It is perfect for completing the idiom - As Cool as a ____________";
                word = "C U C U M B E R";
            }
            break;
            case 8: {
                clue = "Consists of two or more slices of bread with fillings betweent them";
                word = "S A N D W I C H";
            }
            break;
            case 9: {
                clue = "It is a type of food typically made from an unleavened dough of wheat flour mixed with water or eggs, and formed into sheets or other shapes, then cooked by boiling or baking";
                word = "P A S T A";
            }
            break;
        }
        return new String[]{word, clue};
    }

    public String[] Countries() {
        option = (int) (Math.random() * 10);
        switch (option) {
            case 0: {
                clue = "Means 'Rich Coast' in Spanish";
                word = "C O S T A | R I C A";
            }
            break;
            case 1: {
                clue = "It is a country in South Asia. It is the seventh-largest country by area, the second-most populous country, and the most populous democracy in the world";
                word = "I N D I A";
            }
            break;
            case 2: {
                clue = "It is T&T";
                word = "T R I N I D A D | A N D | T O B A G O";
            }
            break;
            case 3: {
                clue = "Consists of nearly one thousand islands!";
                word = "S O L O M O N | I S L A N D S";
            }
            break;
            case 4: {
                clue = "It's capital is Riyadh";
                word = "S A U D I | A R A B I A";
            }
            break;
            case 5: {
                clue = "It is an archipelagic country in Southeast Asia. Lucky Draw: You get a free letter: P";
                word = "T H E | P H I L I P P I N E S";
            }
            break;
            case 6: {
                clue = "The fastest man on earth is from this country - ";
                word = "J A M A I C A";
            }
            break;
            case 7: {
                clue = "3 movies have been filmed using this name";
                word = "M A D A G A S C A R";
            }
            break;
            case 8: {
                clue = "Greatest world power";
                word = "U N I T E D | S T A T E S | O F | A M E R I C A";
            }
            break;
            case 9: {
                clue = "It is a Southeast Asian country known for its beaches, rainforests and mix of several different cultural influences. Lucky Draw: You get one free letter : P";
                word = "M A L A Y S I A";
            }
            break;
        }
        return new String[]{word, clue};
    }

}
