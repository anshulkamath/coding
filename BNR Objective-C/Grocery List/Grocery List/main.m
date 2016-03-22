//
//  main.m
//  Grocery List
//
//  Created by Anshul Kamath on 8/31/14.
//  Copyright (c) 2014 ChoppSopht LLC. All rights reserved.
//

#import <Foundation/Foundation.h>

int main(int argc, const char * argv[])
{

    @autoreleasepool {
        NSMutableArray *grocery = [NSMutableArray array];
        
        [grocery addObject:@"Loaf of Bread"];
        [grocery addObject:@"Container of Milk"];
        [grocery addObject:@"Stick of butter"];
        NSLog(@"My grocery list is:");
            
        for (NSMutableArray *f in grocery) {
            
            NSLog(@"%@", f);
            }
    }
    return 0;
}

