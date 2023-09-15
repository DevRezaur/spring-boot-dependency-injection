# Dependency Injection (DI) & Inversion of Control (IoC)

### Dependency Injection (DI)

Classes often require references to other classes. For example, a **Programmer** class might
need a reference to an **Computer** class. These required classes are called dependencies, and in this example the
**Programmer** class is dependent on having an instance of the **Computer** class to run.

And dependency injection is the mechanism of providing the dependencies to the dependent class.

In our case, providing the **Computer** reference to the **Programmer** class.

### Inversion of Control (IoC)

Inversion of control is a programming principal that transfers the responsibility of Dependency Injection (DI) to some
mechanism or framework.

Basically it transfers the control to the framework, hence the name inversion of control (IoC).

# Example

Let's imagine we have two Java class. **Programmer** & **Computer** as below.

```java

public class Programmer {

    private String name;

    // Reference of Computer class
    private Computer computer;

    public Programmer(String name, Computer computer) {
        this.name = name;
        this.computer = computer;
    }

    // Getters & setters
}

```

```java

public class Computer {

    private String brand;

    public Computer(String brand) {
        this.brand = brand;
    }

    // Getters & setters
}

```

We can see that **Programmer** class contains a reference of **Computer** class. In other words, **Programmer** class \
has dependency on **Computer** class.

Now if we want to create an object of **Programmer** class, we need to pass a reference of **Computer** class. Like
below.

```java

public class MainClass {

    public static void main(String[] args) {

        Computer computer = new Computer("Dell");

        // Injecting the dependency manually. This is called manual dependency injection
        Programmer programmer = new Programmer("Rezaur", computer);
    }
}

```

Now if we pass the responsibility of injecting the depoency to a framework (i.e. spring framework), then it will be
called inversion of control (IoC). Example given below.

```java

@SpringBootApplication
public class MainClass {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MainClass.class, args);

        // Letting framework handle the dependency injection
        // We are not providing the dependency
        Programmer p1 = context.getBean(Programmer.class);
        p1.printDetails();
    }
}

```

#### N.B: Please go through the code base for detailed information
