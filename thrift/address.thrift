namespace java com.thriftyclient.gen

/**
 * Represents an address.
 */
struct Address{
  1: string line1,
  2: optional string line2,
  3: string city,
  4: string state,
  5: string country
}