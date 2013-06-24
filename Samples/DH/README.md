
Diffie Hellman Key Negotiation
==============================

This program exercises TinyECC's Diffie Hellman code

    Alice
    Public.x = 15113bce1ea269c02e30842169a9217c9acd24f5
    Public.y = c0c22799951ccc68a677ad1ad5cb48c93942b008
    Private  = b6e567fcd8717f45263275eb06c1bc7f73e6c117

    Bob
    Public.x = 79e7c485d9dd5ce2beaf8d2b6389adca6c81ae7e
    Public.y = 438b0f659e6fee02d1c59c0d489275552062cfbb
    Private  = cff055becdf72b184855b11cc15a3f715a2ea9bf

# Alice

    Public.x = 1511 3bce 1ea2 69c0 2e30 8421 69a9 217c 9acd 24f5
     { 0x24F5, 0x9ACD, 0x217C, 0x69A9, 0x8421, 0x2E30, 0x69C0, 0x1EA2, 0x3BCE, 0x1511 }

    Public.y = c0c2 2799 951c cc68 a677 ad1a d5cb 48c9 3942 b008
     { 0xB008, 0x3942, 0x48C9, 0xD5CB, 0xAD1A, 0xA677, 0xCC68, 0x951C, 0x2799, 0xC0C2 }

    Private  = b6e5 67fc d871 7f45 2632 75eb 06c1 bc7f 73e6 c117
     { 0xC117, 0x73E6, 0xBC7F, 0x06C1, 0x75EB, 0x2632, 0x7F45, 0xD871, 0x67FC, 0xB6E5 }

# Bob

    Public.x = 79e7 c485 d9dd 5ce2 beaf 8d2b 6389 adca 6c81 ae7e
     { 0xAE7E, 0x6C81, 0xADCA, 0x6389, 0x8D2B, 0xBEAF, 0x5CE2, 0xD9DD, 0xC485, 0x79E7 }

    Public.y = 438b 0f65 9e6f ee02 d1c5 9c0d 4892 7555 2062 cfbb
     { 0xCFBB, 0x2062, 0x7555, 0x4982, 0x9C0D, 0xD1C5, 0xEE02, 0x9E6F, 0x0F65, 0x438B }

    Private  = cff0 55be cdf7 2b18 4855 b11c c15a 3f71 5a2e a9bf
     { 0xA9BF, 0x5A2E, 0x3F71, 0xC15A, 0xB11C, 0x4855, 0x2B18, 0xCDF7, 0x55BE, 0xCFF0 }
