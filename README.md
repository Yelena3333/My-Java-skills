# My-tech-skills
This repository reflects some of my technical skills

- Java skills

Task:

Description

Use common OOP principles for creating a program which emulates phone number typing via virtual keyboard in a web browser.

image

Note that it's not required to interact with a real browser. You should build a set of abstractions which reflects your programming skills.

Virtual keyboard has the following markup:

<div class="vKeyboard">
    <button class="key">1</button>
    <button class="key">2</button>
    <button class="key">3</button>
    <button class="key">4</button>
    <button class="key">5</button>
    <button class="key">6</button>
    <button class="key">7</button>
    <button class="key">8</button>
    <button class="key">9</button>
    <button class="key">0</button>
</div>>
Prerequisites

Create a Browser interface which is similar to the following abstract class:
public abstract class AbstractBrowser {
    abstract void click(String elementPath);
}
Create Chrome and Firefox implementations of a Browser interface.
Both classes should encapsulate a real name of a web browser.
When you call a specific click implementation, the following message should be displayed in a console / terminal log:
Clicking //button[@class='key' and text()='X'] in a Y browser.
Where X is an exact number clicked by user, Y is a name of a web browser encapsulated within specific implementation.
Program's logic

Create a constant to locate a virtual key on a web page: //button[@class='key' and text()='%s']
Create a helper method which returns a random phone number in the following format: [country_code][mobile_operator][phone_number]
Use RandomStringUtils class from commons-lang3 library (already included as project dependency) for randomization.
Create a list of Chrome and Firefox browsers.
For each browser instance generate a random phone number.
Split generated phone number into array of digits.
Replace virtual key placeholder (%s) with a single digit, so that you can get a unique element's path on each iteration, e.g. //button[@class='key' and text()='1']
For each browser instance call click method and pass recently generated unique element's path as an argument.
As a result you should see a set of notifications in a console / terminal log, which confirm that your program has emulated a random phone number typing behavior via virtual keyboard in different web browsers.
