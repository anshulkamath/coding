//
//  BNRLogger.m
//  Callbacks
//
//  Created by Anshul Kamath on 4/7/15.
//  Copyright (c) 2015 JAMBAM LLC. All rights reserved.
//

#import "BNRLogger.h"

@interface BNRLogger ()

- (void)zoneChange:(NSNotification *)note;

@end

@implementation BNRLogger

- (NSString *)lastTimeString
{
    static NSDateFormatter *dateFormatter = nil;
    if (!dateFormatter) {
        dateFormatter = [[NSDateFormatter alloc] init];
        [dateFormatter setTimeStyle:NSDateFormatterMediumStyle];
        [dateFormatter setDateStyle:NSDateFormatterMediumStyle];
    }
    return [dateFormatter stringFromDate:self.lastTime];
}
- (void) updateLastTime:(NSTimer *)t
{
    NSDate *now = [NSDate date];
    [self willChangeValueForKey:@"lastTime"];
    _lastTime = now;
    [self didChangeValueForKey:@"lastTime"];
    NSLog(@"Just set the time to %@", self.lastTimeString);
}

// Calling each time a new chunk of data arrives
- (void)connection:(NSURLConnection *)connection
    didReceiveData:(NSData *)data
{
    NSLog(@"Recieved %lu bytes", [data length]);
    
    // Create a mutable data if it does not already exist
    if (!_incomingData) {
        _incomingData = [[NSMutableData alloc] init];
    }
    
    [_incomingData appendData:data];
}

// Called when the last chunk has been processed
- (void)connectionDidFinishLoading:(NSURLConnection *)connection
{
    NSLog(@"Got it all!");
    NSString *string = [[NSString alloc] initWithData:_incomingData
                                             encoding:NSUTF8StringEncoding];
    
    _incomingData = nil;
    NSLog(@"The string has %lu characters", [string length]);
    
    // Uncomment the next line to see the entire fetched files
    NSLog(@"The whole string is %@", string);
}

// Called if the fetch fails
- (void)connectionDidFinishLoading:(NSURLConnection *)connection
   didFailWithError:(NSError *)error
{
    NSLog(@"connection failed: %@", [error localizedDescription]);
    _incomingData = nil;
}

-(void)zoneChange:(NSNotification *)note
{
    NSLog(@"The system time zone has changed!");
}

+ (NSSet *)keyPathsForValuesAffectingLastTimeString
{
    return [NSSet setWithObject:@"lastTime"];
}

@end
