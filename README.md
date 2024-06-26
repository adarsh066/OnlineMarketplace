# OnlineMarketplace

## Description
OnlineMarketplace is a Java project that demonstrates the use of priority queues in an online marketplace context. It prioritizes products based on their priority levels and provides a simple simulation of a marketplace.

## Project Structure
- `Product`: Represents a product in the marketplace with a name, price, and priority.
- `ProductComparator`: Custom comparator to sort products based on their priority.
- `Marketplace`: Main class to simulate the marketplace and print products based on priority.

## How to Run
1. Clone the repository.
2. Navigate to the project directory.
3. Compile the Java files using the command: `javac -d bin src/com/online/marketplace/*.java`
4. Run the project using the command: `java -cp bin com.online.marketplace.Marketplace`

## Example Output
Products sorted by priority:
Product{name='Laptop', price=1000.0, priority=1}
Product{name='Headphones', price=200.0, priority=2}
Product{name='Smartwatch', price=300.0, priority=2}
Product{name='Smartphone', price=700.0, priority=3}
Product{name='Tablet', price=500.0, priority=3}

