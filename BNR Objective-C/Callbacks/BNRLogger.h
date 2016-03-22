//
//  BNRLogger.h
//  Callbacks
//
//  Created by Anshul Kamath on 4/7/15.
//  Copyright (c) 2015 JAMBAM LLC. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface BNRLogger : NSObject
        <NSURLConnectionDelegate, NSURLConnectionDataDelegate>

{
    NSMutableData *_incomingData;
}

@property (nonatomic) NSDate *lastTime;
- (NSString *)lastTimeString;
- (void)updateLastTime:(NSTimer *)t;
- (void)connection:(NSURLConnection *)connection
    didReceiveData:(NSData *)data;
- (void)connectionDidFinishLoading:(NSURLConnection *)connection;
- (void)connectionDidFinishLoading:(NSURLConnection *)connection
                  didFailWithError:(NSError *)error;

@end
