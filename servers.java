// Imagine that your are implemented a simplified load balancer to route user requests to multiple servers. You are given an array of integers serversPowers, where serversPowers[i] (assume 0-based indexing) is an integer between 1 to 5 representing the capacity of the ith server - the maximum number of user requests that the server can handle during each cycle. You are also given an array of strings events, where event[i] can be one of the following:

// "REQUEST" - user request
// "FAIL <i>" - shut down the ith server, so it can no longer serve any requests
// The load balancer handles user requests by routing them to the servers in cyclic order - each server should serve as many requests as it can based on its total capacity defined by serversPowers[i] before requests are routed to the next server (i.e., the i+1th server). After each cycle (i.e., when requests must be routed to serversPowers[0] again), the capacity of all non-failed servers are reset, but failed servers should remain shut down/inactive.

// Notes

// The load balancer should bypass any servers which are failed/shut down when routing requests.
// It is guaranteed that there is at least one functioning server at all times.
// Return the index of the server that has served most of the requests, or in case of a tie, return the server with the largest index.
// Note: Failed servers should be considered.

// Example

// For serversPowers = [1, 2, 1, 2, 1] and

// events = [
//   "REQUEST",
//   "REQUEST",
//   "FAIL 2",
//   "REQUEST",
//   "FAIL 3",
//   "REQUEST",
//   "REQUEST"
// ]
// the output should be solution(serversPowers, events) = 1.

// Explanation:

// events[0] = "REQUEST" – the first request goes to server 0, so requests count for each server is [1, 0, 0, 0, 0],
// events[1] = "REQUEST" – the next request goes to server 1, so requests count for each server is now [1, 1, 0, 0, 0],
// events[2] = "FAIL 2" – the server with index 2 is shut down,
// events[3] = "REQUEST" – the next request goes to server 1 as it still has capacity, so requests count for each server is now [1, 2, 0, 0, 0],
// events[4] = "FAIL 3" – the server with index 3 is shut down,
// events[5] = "REQUEST" – the next request goes to server 4, bypassing servers with index 2 and 3 as those are shut down, so requests count for each server is now [1, 2, 0, 0, 1],
// events[6] = "REQUEST" – the next request goes to server 0 again following the cyclic order, and requests count for each server is now [2, 2, 0, 0, 1],
// Thus, the number of requests served by each server is [2, 2, 0, 0, 1]. Since both servers 0 and 1 have served the most requests at 2 each, the final answer is the largest index of 1.

int solution(int[] serversPowers, String[] events) {

}
