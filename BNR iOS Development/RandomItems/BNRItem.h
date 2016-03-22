//
//  BNRItem.h
//  RandomItems
//
//  Created by Anshul Kamath on 4/10/15.
//  Copyright (c) 2015 JAMBAM LLC. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface BNRItem : NSObject

@property (nonatomic, strong) BNRItem *containedItem;
@property (nonatomic, weak) BNRItem *container;


@property (nonatomic, copy) NSString *itemName;
@property (nonatomic, copy) NSString *serialNumber;
@property (nonatomic) int valueInDollars;
@property (nonatomic, readonly, strong) NSDate *dateCreated;

+ (instancetype)randomItems;

// Designated initializer for BNRItem
- (instancetype) initWithName:(NSString *)name
               valueInDollars:(int)value
                 serialNumber:(NSString *)sNumber;

- (instancetype) initWithItemName:(NSString *)name;

@end
