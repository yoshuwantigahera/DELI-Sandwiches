h
Zanzibar DELI-Sandwiches
Zanzibar DELI-Sandwiches is a Java-based Point-of-Sale (POS) system designed for managing orders at a sandwich shop. The system enables users to create custom sandwiches, add drinks and chips, and finalize orders with an easy-to-read summary and receipt. Its intuitive interface ensures fast and efficient order processing.

Features
Custom Sandwich Creation:

Select from multiple bread types, sizes, and toasting preferences.
Add regular or premium toppings to create personalized sandwiches.
Drink and Chips Selection:

Choose from a variety of drink sizes and flavors.
Add chips to complete the meal.
Order Management:

View a detailed order summary.
Cancel orders if needed.
Confirm checkout and generate a timestamped receipt.
Class Overview
Main Classes
UserInterface: Manages user interaction, displays menus, and handles navigation through the app.
Order: Represents a single customer order, including sandwiches, drinks, and chips.
Sandwich: Defines a customizable sandwich, including bread type, size, toasting option, and toppings.
Drink: Represents a drink, with options for size and flavor.
Chips: Represents a chips selection, allowing for various flavors.
Additional Classes
Topping (Abstract): Base class for sandwich toppings.
PremiumTopping: Extends Topping to represent premium toppings (e.g., bacon, cheese).
RegularTopping: Extends Topping to represent standard toppings (e.g., lettuce, tomatoes).
Enumerations
BreadType: Enum for bread types (e.g., White, Wheat, Rye).
SandwichSize: Enum for sandwich sizes (e.g., FourInch, EightInch, TwelveInch).
DrinkFlavor: Enum for drink flavors (e.g., Cola, Lemonade, IcedTea).
ChipsFlavor: Enum for chips flavors (e.g., SaltAndVinegar, BBQ, Plain).
ToppingType: Enum for topping categories (e.g., Meat, Vegetable).
Installation
Follow these steps to set up the project on your local machine:

Clone the Repository:

bash
Copy code
git clone https://github.com/yoshuwantigahera/DELI-Sandwiches.git
Navigate to the Project Directory:

bash
Copy code
cd DELI-Sandwiches
Open the Project in Your IDE:

Use your preferred IDE (e.g., IntelliJ IDEA, Eclipse).
Ensure Java is properly configured.
Build and Run the Application:

Compile the code.
Run the UserInterface class to start the application.
Usage
Launch the App:

Start the app to access the main menu.
Create a New Order:

Select New Order from the home screen.
Customize your sandwiches, drinks, and chips.
View and Manage Orders:

View the summary of your current order.
Add, remove, or modify items as needed.
Checkout:

Confirm the order and generate a receipt in the receipts/ directory.
