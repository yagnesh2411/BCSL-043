class Player {
    String name;
    int age;

    Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void Display_Info() {
        System.out.println("Player Name: " + name);
        System.out.println("Age: " + age);
    }
  
}

class Cricket_Player extends Player {
    String team;

    Cricket_Player(String name, int age, String team) {
        super(name, age);
        this.team = team;
    }

    @Override
    void Display_Info() {
        super.Display_Info();
        System.out.println("Sport: Cricket");
        System.out.println("Team: " + team);
    }
}

class Football_Player extends Player {
    String club;

    Football_Player(String name, int age, String club) {
        super(name, age);
        this.club = club;
    }

    @Override
    void Display_Info() {
        super.Display_Info();
        System.out.println("Sport: Football");
        System.out.println("Club: " + club);
    }
}

public class PlayerDemo {
    public static void main(String[] args) {
        
        Cricket_Player cp = new Cricket_Player("Yuvraj Singh", 36, "India");
        Cricket_Player Cp = new Cricket_Player("Virat Kohli", 34, "India");
        Football_Player fp = new Football_Player("Lionel Messi", 36, "Inter Miami");

        System.out.println("Cricket Player Info:");
        cp.Display_Info();
        System.out.println();
        
        System.out.println("Cricket Player Info:");
        Cp.Display_Info();
        System.out.println();

        System.out.println("Football Player Info:");
        fp.Display_Info();
    }
}