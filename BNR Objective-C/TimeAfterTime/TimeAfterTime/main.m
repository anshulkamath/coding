//
//  main.m
//  TimeAfterTime
//
//  Created by Anshul Kamath on 8/12/14.
//  Copyright (c) 2014 ChoppSopht LLC. All rights reserved.
//

#import <Foundation/Foundation.h>

int main(int argc, const char * argv[])
{

    @autoreleasepool {
        
        NSDate *now = [[NSDate alloc] init];
        NSLog(@"This NSDate lives at %p", now);
        NSLog(@"The date is %@", now);
        
        
        double seconds = [now timeIntervalSince1970];
        NSLog(@"It has been %f seconds since the start of 1970.", seconds);
        
        NSDate *later = [now dateByAddingTimeInterval:100000];
        NSLog(@"The time 100,000 seconds from now is %@", later);
        
        NSCalendar *cal = [NSCalendar currentCalendar];
        NSLog(@"My calendar is %@", [cal calendarIdentifier]);
        
        unsigned long day = [cal ordinalityOfUnit:NSDayCalendarUnit
                                           inUnit:NSMonthCalendarUnit
                                          forDate:now];
        NSLog(@"This is day %lu of the month", day);
        
        
    }
    return 0;
}