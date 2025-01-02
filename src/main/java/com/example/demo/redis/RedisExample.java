package com.example.demo.redis;

import redis.clients.jedis.Jedis;

import java.util.Scanner;

public class RedisExample {

    public static void main(String[] args) {
        // Connect to Redis
        Jedis jedis = new Jedis("localhost", 6379); // Default Redis server is on localhost and port 6379

        // Scanning the object that will print 
        Scanner scanner = new Scanner(System.in);
        
        // Storing dynamic key-value data
        System.out.print("Enter key: ");
        String key = scanner.nextLine();  // e.g., user:1000

        System.out.print("Enter value: ");
        String value = scanner.nextLine();  // e.g., John

        // Store data in Redis
        jedis.set(key, value);
        System.out.println("Stored " + key + " with value: " + value);

        // Retrieve data dynamically
        System.out.print("Enter key to retrieve: ");
        String keyToRetrieve = scanner.nextLine();

        // Retrieve and print the value associated with the key
        String retrievedValue = jedis.get(keyToRetrieve);
        if (retrievedValue != null) {
            System.out.println("Value for key " + keyToRetrieve + ": " + retrievedValue);
        } else {
            System.out.println("Key " + keyToRetrieve + " not found in Redis.");
        }

        // Close the connection
        jedis.close();
    }
}
