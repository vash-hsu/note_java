public class PuppyHome {

    public static void main(String[] args) {
        Puppy cat = new Puppy("snowboard");
        Puppy dog = new Puppy("doggy");
        cat.setAge(3);
        dog.setAge(5);
        System.out.println(cat.getName() + " whose age is " + cat.getAge());
        System.out.println(dog.getName() + " whose age is " + dog.getAge());
        System.out.println("=====");
        Puppy[] puppies = new Puppy[2];
        puppies[0] = cat;
        puppies[1] = dog;
        for (Puppy i:puppies) {
            System.out.println(i.getName() + " whose age is " + i.getAge() );
        }

    }

}
