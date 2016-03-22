//
//  BNRItem.m
//  RandomItems
//
//  Created by Anshul Kamath on 4/10/15.
//  Copyright (c) 2015 JAMBAM LLC. All rights reserved.
//

#import "BNRItem.h"

@implementation BNRItem

+ (instancetype)randomItems
{
    // Create an immutable array of three adjectives
    NSArray *randomAdjectiveList = @[@"Fluffy", @"Rusty", @"Shiny"];
    
    // Create an immutable array of three nouns
    NSArray *randomNounList = @[@"Bear", @"Spork", @"Mac"];
    
    // Get the index of a random adjective/noun from the lists
    // Note: The % operator, called the modulo operator, give you the
    // remainder. So adjectiveIndex is a random number from 0 to 2 inclusive.
    NSInteger adjectiveIndex = arc4random() % [randomAdjectiveList count];
    NSInteger nounIndex = arc4random() % [randomNounList count];
    
    // Note that NSInteger is not an object, but a type definition for "long"
    NSString *randomName = [NSString stringWithFormat:@"%@ %@",
                            randomAdjectiveList[adjectiveIndex],
                            randomNounList[nounIndex]];
    
    int randomValue = arc4random() % 100;
    
    NSString *randomSerialNumber = [NSString stringWithFormat:@"%C%C%C%C%C",
                            (unichar)('0' + arc4random() % 10),
                            (unichar)('A' + arc4random() % 26),
                            (unichar)('0' +  + arc4random() % 10),
                            (unichar)('A' + arc4random() % 26),
                            (unichar)('0' + arc4random() % 10)];
    
    BNRItem *newItem = [[self alloc] initWithName:randomName
                                   valueInDollars:randomValue
                                     serialNumber:randomSerialNumber];
    
    return newItem;
}

- (NSString *)description
{
    NSString *descriptionString = [[NSString alloc] initWithFormat:@"%@ (%@): Worth $%d, recorded on %@",
     self.itemName,
     self.serialNumber,
     self.valueInDollars,
     self.dateCreated];
    
    return descriptionString;
}

- (instancetype) initWithName:(NSString *)name
               valueInDollars:(int)value
                 serialNumber:(NSString *)sNumber
{
    // Call the superclass's designated initializer
    self = [super init];
    
    // Did the superclass's designated initializer succeed?
    if (self) {
        // Give the instace variables initial values
        self.itemName = name;
        self.serialNumber = sNumber;
        self.valueInDollars = value;
        _dateCreated = [[NSDate alloc] init];
    }
    
    // Return the self value of the newly initialized object
    return self;
}

- (instancetype) initWithItemName:(NSString *)name
{
    return [self initWithName:name
               valueInDollars:0
                 serialNumber:@""];
}
- (instancetype) init
{
    return [self initWithItemName:@"Item"];
}
- (void) dealloc
{
    NSLog(@"Destroyed: %@", self);
}

- (void)containedItem:(BNRItem *)item
{
    _containedItem = item;
    
    // When given an item to contain, the contained
    // item will be given a pointer to its container
    item.container = self;
}

@end
