package com.fake;

public record PersonRecord(String name, int age) {
}

// useful for DTO's - Data Transfer Objects

//Use Records for:
//DTOs (Data Transfer Objects)
//Value objects (Money, Point, Range)
//Configuration objects
//Return types from methods
//Any immutable data container

//Don't Use Records for:
//Mutable data
//Classes with complex behavior
//Classes that need to extend other classes
//Entities with identity (like JPA entities)
