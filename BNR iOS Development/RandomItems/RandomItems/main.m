//
//  main.m
//  RandomItems
//
//  Created by Anshul Kamath on 4/10/15.
//  Copyright (c) 2015 JAMBAM LLC. All rights reserved.
//

@import Foundation;
#import "BNRItem.h"

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        
        NSMutableArray *items = [[NSMutableArray alloc] init];
        
        BNRItem *backpack = [[BNRItem alloc] initWithItemName:@"Backpack"];
        [items addObject:backpack];
        
        BNRItem *calculator = [[BNRItem alloc] initWithItemName:@"Calculator"];
        [items addObject:calculator];
        
        backpack.containedItem = calculator;
        
        for (BNRItem *item in items) {
            NSLog(@"%@", item);
        }
        
        items = nil;
        
        
    }
    return 0;
}
