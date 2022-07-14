package io.scalajs.nodejs.crypto

import com.thoughtworks.enableIf
import io.scalajs.nodejs.buffer.Buffer
import io.scalajs.nodejs.stream.{TransformOptions, WritableOptions}
import io.scalajs.nodejs.v8.SharedArrayBuffer
import io.scalajs.nodejs.Error

import scala.scalajs
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.typedarray.{ArrayBuffer, DataView, TypedArray}
import scala.scalajs.js.|

/** The crypto module provides cryptographic functionality that includes a set of wrappers for OpenSSL's hash, HMAC,
  * cipher, decipher, sign and verify functions.
  * @see
  *   https://nodejs.org/dist/latest-v7.x/docs/api/crypto.html#crypto_crypto
  */
@js.native
trait Crypto extends js.Object {
  // ///////////////////////////////////////////////////////////////////////////////
  //      Methods
  // ///////////////////////////////////////////////////////////////////////////////

  def createCipheriv(algorithm: String, key: String, iv: String, options: TransformOptions): Cipher        = js.native
  def createCipheriv(algorithm: String, key: String, iv: BufferLike): Cipher                               = js.native
  def createCipheriv(algorithm: String, key: BufferLike, iv: String, options: TransformOptions): Cipher    = js.native
  def createCipheriv(algorithm: String, key: BufferLike, iv: BufferLike): Cipher                           = js.native
  def createCipheriv(algorithm: String, key: KeyObject, iv: String, options: TransformOptions): Cipher     = js.native
  def createCipheriv(algorithm: String, key: KeyObject, iv: BufferLike, options: TransformOptions): Cipher = js.native
  def createCipheriv(algorithm: String, key: KeyObject, iv: String): Cipher                                = js.native
  def createCipheriv(algorithm: String, key: KeyObject, iv: BufferLike): Cipher                            = js.native

  def createDecipheriv(algorithm: String, key: String, iv: String, options: TransformOptions): Decipher     = js.native
  def createDecipheriv(algorithm: String, key: String, iv: BufferLike, options: TransformOptions): Decipher = js.native
  def createDecipheriv(algorithm: String, key: BufferLike, iv: String): Decipher                            = js.native
  def createDecipheriv(algorithm: String, key: BufferLike, iv: BufferLike): Decipher                        = js.native
  def createDecipheriv(algorithm: String, key: KeyObject, iv: String, options: TransformOptions): Decipher  = js.native
  def createDecipheriv(algorithm: String, key: KeyObject, iv: BufferLike, options: TransformOptions): Decipher =
    js.native
  def createDecipheriv(algorithm: String, key: KeyObject, iv: String): Decipher     = js.native
  def createDecipheriv(algorithm: String, key: KeyObject, iv: BufferLike): Decipher = js.native

  def createDiffieHellman(prime: String, primeEncoding: String, generator: Int): DiffieHellman        = js.native
  def createDiffieHellman(prime: String, primeEncoding: String, generator: BufferLike): DiffieHellman = js.native
  def createDiffieHellman(prime: String,
                          primeEncoding: String,
                          generator: String,
                          generatorEncoding: String
  ): DiffieHellman = js.native
  def createDiffieHellman(prime: BufferLike, generator: String, generatorEncoding: String): DiffieHellman = js.native
  def createDiffieHellman(prime: BufferLike, generator: Int): DiffieHellman                               = js.native
  def createDiffieHellman(prime: BufferLike, generator: BufferLike): DiffieHellman                        = js.native
  def createDiffieHellman(primeLength: Int, generator: Int): DiffieHellman                                = js.native

  def createDiffieHellmanGroup(name: String): DiffieHellman = js.native

  def createECDH(curveName: String): ECDH = js.native

  /** Creates and returns a Hash object that can be used to generate hash digests using the given algorithm.
    *
    * The algorithm is dependent on the available algorithms supported by the version of OpenSSL on the platform.
    * Examples are 'sha256', 'sha512', etc. On recent releases of OpenSSL, openssl list-message-digest-algorithms will
    * display the available digest algorithms.
    * @param algorithm
    *   the given algorithm (e.g. 'sha256', 'sha512')
    */
  def createHash(algorithm: String, options: CreateHashOptions): Hash = js.native
  def createHash(algorithm: String): Hash                             = js.native

  /** Creates and returns an Hmac object that uses the given algorithm and key.
    *
    * The algorithm is dependent on the available algorithms supported by the version of OpenSSL on the platform.
    * Examples are 'sha256', 'sha512', etc. On recent releases of OpenSSL, openssl list-message-digest-algorithms will
    * display the available digest algorithms.
    * @param algorithm
    *   the given algorithm (e.g. 'sha256', 'sha512')
    * @param key
    *   The key is the HMAC key used to generate the cryptographic HMAC hash.
    */
  def createHmac(algorithm: String, key: String, options: TransformOptions): Hmac     = js.native
  def createHmac(algorithm: String, key: BufferLike, options: TransformOptions): Hmac = js.native
  def createHmac(algorithm: String, key: String): Hmac                                = js.native
  def createHmac(algorithm: String, key: BufferLike): Hmac                            = js.native
  def createHmac(algorithm: String, key: KeyObject, options: TransformOptions): Hmac  = js.native
  def createHmac(algorithm: String, key: KeyObject): Hmac                             = js.native

  def createPrivateKey(key: String): KeyObject                  = js.native
  def createPrivateKey(key: Buffer): KeyObject                  = js.native
  def createPrivateKey(key: CreatePrivateKeyOptions): KeyObject = js.native

  def createPublicKey(key: String): KeyObject                 = js.native
  def createPublicKey(key: Buffer): KeyObject                 = js.native
  def createPublicKey(key: KeyObject): KeyObject              = js.native
  def createPublicKey(key: CreatePublicKeyOptions): KeyObject = js.native

  def createSecretKey(key: Buffer): KeyObject = js.native

  /** Creates and returns a Sign object that uses the given algorithm. On recent OpenSSL releases, openssl
    * list-public-key-algorithms will display the available signing algorithms. One example is 'RSA-SHA256'.
    * @param algorithm
    *   the given algorithm (e.g. 'RSA-SHA256')
    */
  def createSign(algorithm: String, options: WritableOptions): Sign = js.native
  def createSign(algorithm: String): Sign                           = js.native

  /** Creates and returns a Verify object that uses the given algorithm. On recent OpenSSL releases, openssl
    * list-public-key-algorithms will display the available signing algorithms. One example is 'RSA-SHA256'.
    * @param algorithm
    *   the given algorithm (e.g. 'RSA-SHA256')
    */
  def createVerify(algorithm: String, options: WritableOptions): Verify = js.native
  def createVerify(algorithm: String): Verify                           = js.native

  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs14)
  def diffieHellman(options: DiffieHellmanOptions): Buffer = js.native

  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs16)
  def generateKey(`type`: String, options: GenerateKeyOptions, callback: Callback1[KeyObject]): Unit = js.native

  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs16)
  def generateKeySync(`type`: String, options: GenerateKeyOptions): Unit = js.native

  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs16)
  def generatePrime(size: String, options: GeneratePrimeOptions, callback: Callback1[ArrayBuffer | js.BigInt]): Unit =
    js.native
  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs16)
  def generatePrimeSync(size: String, options: GeneratePrimeOptions): ArrayBuffer | js.BigInt = js.native

  def getCipherInfo(name: String): js.UndefOr[CipherInfo]                                = js.native
  def getCipherInfo(name: String, options: GetCipherInfoOptions): js.UndefOr[CipherInfo] = js.native
  def getCipherInfo(nid: Double): js.UndefOr[CipherInfo]                                 = js.native
  def getCipherInfo(nid: Double, options: GetCipherInfoOptions): js.UndefOr[CipherInfo]  = js.native

  def generateKeyPair(
      `type`: String,
      options: GenerateKeyPairOptions,
      callback: Callback2[String | Buffer | KeyObject, String | Buffer | KeyObject]
  ): Unit = js.native

  def generateKeyPairSync(`type`: String, options: GenerateKeyPairOptions): KeyPair = js.native

  /** Returns an array with the names of the supported cipher algorithms.
    * @return
    *   the names of the supported cipher algorithms. // ['aes-128-cbc', 'aes-128-ccm', ...]
    */
  def getCiphers(): js.Array[String] = js.native

  def getCurves(): js.Array[String] = js.native

  def getDiffieHellman(groupName: String): DiffieHellmanGroup = js.native

  def getFips(): Boolean = js.native

  def getHashes(): js.Array[String] = js.native

  def pbkdf2(password: String,
             salt: String,
             iterations: Int,
             keylen: Int,
             digest: String,
             callback: Callback1[Buffer]
  ): Buffer = js.native
  def pbkdf2(password: String,
             salt: BufferLike,
             iterations: Int,
             keylen: Int,
             digest: String,
             callback: Callback1[Buffer]
  ): Buffer = js.native
  def pbkdf2(password: BufferLike,
             salt: String,
             iterations: Int,
             keylen: Int,
             digest: String,
             callback: Callback1[Buffer]
  ): Buffer = js.native
  def pbkdf2(password: BufferLike,
             salt: BufferLike,
             iterations: Int,
             keylen: Int,
             digest: String,
             callback: Callback1[Buffer]
  ): Buffer = js.native

  /** Provides a synchronous Password-Based Key Derivation Function 2 (PBKDF2) implementation. A selected HMAC digest
    * algorithm specified by digest is applied to derive a key of the requested byte length (keylen) from the password,
    * salt and iterations.
    *
    * If an error occurs an Error will be thrown, otherwise the derived key will be returned as a Buffer.
    *
    * The iterations argument must be a number set as high as possible. The higher the number of iterations, the more
    * secure the derived key will be, but will take a longer amount of time to complete.
    *
    * The salt should also be as unique as possible. It is recommended that the salts are random and their lengths are
    * greater than 16 bytes. See NIST SP 800-132 for details.
    *
    * (Doc source: https://nodejs.org/api/crypto.html#crypto_crypto_pbkdf2sync_password_salt_iterations_keylen_digest)
    */
  def pbkdf2Sync(password: String, salt: String, iterations: Int, keylen: Int, digest: String): Buffer     = js.native
  def pbkdf2Sync(password: String, salt: BufferLike, iterations: Int, keylen: Int, digest: String): Buffer = js.native
  def pbkdf2Sync(password: BufferLike, salt: String, iterations: Int, keylen: Int, digest: String): Buffer = js.native
  def pbkdf2Sync(password: BufferLike, salt: BufferLike, iterations: Int, keylen: Int, digest: String): Buffer =
    js.native

  def privateDecrypt(privateKey: String, buffer: BufferLike): Buffer                  = js.native
  def privateDecrypt(privateKey: Buffer, buffer: BufferLike): Buffer                  = js.native
  def privateDecrypt(privateKey: PrivateDecryptKeyObject, buffer: BufferLike): Buffer = js.native

  def privateEncrypt(privateKey: String, buffer: BufferLike): Buffer                  = js.native
  def privateEncrypt(privateKey: Buffer, buffer: BufferLike): Buffer                  = js.native
  def privateEncrypt(privateKey: PrivateEncryptKeyObject, buffer: BufferLike): Buffer = js.native

  def publicDecrypt(key: String, buffer: BufferLike): Buffer                 = js.native
  def publicDecrypt(key: Buffer, buffer: BufferLike): Buffer                 = js.native
  def publicDecrypt(key: PublicDecryptKeyObject, buffer: BufferLike): Buffer = js.native

  def publicEncrypt(key: String, buffer: BufferLike): Buffer                 = js.native
  def publicEncrypt(key: Buffer, buffer: BufferLike): Buffer                 = js.native
  def publicEncrypt(key: PublicEncryptKeyObject, buffer: BufferLike): Buffer = js.native

  def randomBytes(size: Int): Buffer                            = js.native
  def randomBytes(size: Int, callback: Callback1[Buffer]): Unit = js.native

  def randomFillSync(buffer: Buffer, offset: Int, size: Int): Buffer = js.native
  def randomFillSync(buffer: Buffer, offset: Int): Buffer            = js.native
  def randomFillSync(buffer: Buffer): Buffer                         = js.native

  def randomFillSync(buffer: scala.scalajs.js.typedarray.DataView,
                     offset: Int,
                     size: Int
  ): scala.scalajs.js.typedarray.DataView = js.native
  def randomFillSync(buffer: scala.scalajs.js.typedarray.DataView, offset: Int): scala.scalajs.js.typedarray.DataView =
    js.native
  def randomFillSync(buffer: scala.scalajs.js.typedarray.DataView): scala.scalajs.js.typedarray.DataView = js.native
  def randomFillSync[T <: scala.scalajs.js.typedarray.TypedArray[_, T]](buffer: T, offset: Int, size: Int): T =
    js.native
  def randomFillSync[T <: scala.scalajs.js.typedarray.TypedArray[_, T]](buffer: T, offset: Int): T = js.native
  def randomFillSync[T <: scala.scalajs.js.typedarray.TypedArray[_, T]](buffer: T): T              = js.native

  def randomFill(buffer: Buffer, offset: Int, size: Int, callback: Callback1[Buffer]): Buffer = js.native
  def randomFill(buffer: Buffer, offset: Int, callback: Callback1[Buffer]): Buffer            = js.native
  def randomFill(buffer: Buffer, callback: Callback1[Buffer]): Buffer                         = js.native

  def randomFill(buffer: scala.scalajs.js.typedarray.DataView,
                 offset: Int,
                 size: Int,
                 callback: Callback1[scala.scalajs.js.typedarray.DataView]
  ): scala.scalajs.js.typedarray.DataView =
    js.native
  def randomFill(buffer: scala.scalajs.js.typedarray.DataView,
                 offset: Int,
                 callback: Callback1[scala.scalajs.js.typedarray.DataView]
  ): scala.scalajs.js.typedarray.DataView =
    js.native
  def randomFill(buffer: scala.scalajs.js.typedarray.DataView,
                 callback: Callback1[scala.scalajs.js.typedarray.DataView]
  ): scala.scalajs.js.typedarray.DataView =
    js.native
  def randomFill[T <: scala.scalajs.js.typedarray.TypedArray[_, T]](buffer: T,
                                                                    offset: Int,
                                                                    size: Int,
                                                                    callback: Callback1[T]
  ): T = js.native
  def randomFill[T <: scala.scalajs.js.typedarray.TypedArray[_, T]](buffer: T, offset: Int, callback: Callback1[T]): T =
    js.native
  def randomFill[T <: scala.scalajs.js.typedarray.TypedArray[_, T]](buffer: T, callback: Callback1[T]): T = js.native

  def randomInt(max: Int): Int                                      = js.native
  def randomInt(max: Int, callback: Callback1[Int]): Unit           = js.native
  def randomInt(min: Int, max: Int): Int                            = js.native
  def randomInt(min: Int, max: Int, callback: Callback1[Int]): Unit = js.native

  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs16)
  def randomUUID(options: RandomUUIDOptions): String = js.native
  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs16)
  def randomUUID(): String = js.native

  def scrypt(password: String, salt: String, keylen: Int, options: ScryptOptions, callback: Callback1[Buffer]): Unit =
    js.native
  def scrypt(password: String,
             salt: BufferLike,
             keylen: Int,
             options: ScryptOptions,
             callback: Callback1[Buffer]
  ): Unit = js.native
  def scrypt(password: BufferLike,
             salt: String,
             keylen: Int,
             options: ScryptOptions,
             callback: Callback1[Buffer]
  ): Unit = js.native
  def scrypt(password: BufferLike,
             salt: BufferLike,
             keylen: Int,
             options: ScryptOptions,
             callback: Callback1[Buffer]
  ): Unit = js.native
  def scrypt(password: String, salt: String, keylen: Int, callback: Callback1[Buffer]): Unit         = js.native
  def scrypt(password: String, salt: BufferLike, keylen: Int, callback: Callback1[Buffer]): Unit     = js.native
  def scrypt(password: BufferLike, salt: String, keylen: Int, callback: Callback1[Buffer]): Unit     = js.native
  def scrypt(password: BufferLike, salt: BufferLike, keylen: Int, callback: Callback1[Buffer]): Unit = js.native

  def scryptSync(password: String, salt: String, keylen: Int, options: ScryptOptions): Buffer         = js.native
  def scryptSync(password: String, salt: BufferLike, keylen: Int, options: ScryptOptions): Buffer     = js.native
  def scryptSync(password: BufferLike, salt: String, keylen: Int, options: ScryptOptions): Buffer     = js.native
  def scryptSync(password: BufferLike, salt: BufferLike, keylen: Int, options: ScryptOptions): Buffer = js.native
  def scryptSync(password: String, salt: String, keylen: Int): Buffer                                 = js.native
  def scryptSync(password: String, salt: BufferLike, keylen: Int): Buffer                             = js.native
  def scryptSync(password: BufferLike, salt: String, keylen: Int): Buffer                             = js.native
  def scryptSync(password: BufferLike, salt: BufferLike, keylen: Int): Buffer                         = js.native

  def setEngine(engine: String, fips: Int): Unit = js.native
  def setEngine(engine: String): Unit            = js.native

  def setFips(enable: Boolean): Unit = js.native

  def sign(algorithm: String, data: BufferLike, key: String): Buffer    = js.native
  def sign(algorithm: String, data: BufferLike, key: Buffer): Buffer    = js.native
  def sign(algorithm: String, data: BufferLike, key: KeyObject): Buffer = js.native
  def sign(data: BufferLike, key: String): Buffer                       = js.native
  def sign(data: BufferLike, key: Buffer): Buffer                       = js.native
  def sign(data: BufferLike, key: KeyObject): Buffer                    = js.native

  def timingSafeEqual(a: BufferLike, b: BufferLike): Boolean = js.native

  def verify(algorithm: String, data: BufferLike, key: String): Boolean    = js.native
  def verify(algorithm: String, data: BufferLike, key: Buffer): Boolean    = js.native
  def verify(algorithm: String, data: BufferLike, key: KeyObject): Boolean = js.native
  def verify(data: BufferLike, key: String): Boolean                       = js.native
  def verify(data: BufferLike, key: Buffer): Boolean                       = js.native
  def verify(data: BufferLike, key: KeyObject): Boolean                    = js.native

  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs16)
  def checkPrime(candidate: ArrayBuffer | SharedArrayBuffer | TypedArray[_, _] | Buffer | DataView | js.BigInt,
                 options: CheckPrimeOptions,
                 callback: Callback1[Boolean]
  ): Unit = js.native

  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs16)
  def checkPrimeSync(candidate: ArrayBuffer | SharedArrayBuffer | TypedArray[_, _] | Buffer | DataView | js.BigInt,
                     options: CheckPrimeOptions
  ): Boolean = js.native
  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs16)
  def checkPrimeSync(
      candidate: ArrayBuffer | SharedArrayBuffer | TypedArray[_, _] | Buffer | DataView | js.BigInt
  ): Boolean = js.native

  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs16)
  def hkdf(digest: String,
           key: String | ArrayBuffer | Buffer | TypedArray[_, _] | DataView | KeyObject,
           salt: String | ArrayBuffer | Buffer | TypedArray[_, _] | DataView,
           info: String | ArrayBuffer | Buffer | TypedArray[_, _] | DataView,
           keylen: Int,
           callback: Callback1[Buffer]
  ): Unit = js.native

  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs16)
  def hkdfSync(digest: String,
               key: String | ArrayBuffer | Buffer | TypedArray[_, _] | DataView | KeyObject,
               salt: String | ArrayBuffer | Buffer | TypedArray[_, _] | DataView,
               info: String | ArrayBuffer | Buffer | TypedArray[_, _] | DataView,
               keylen: Int
  ): Buffer = js.native

  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs16)
  def secureHeapUsed(): HeapUsed = js.native

  // TODO: Add when reached stable
  // webcrypto
}

/** Crypto Singleton
  */
@js.native
@JSImport("crypto", JSImport.Namespace)
object Crypto extends Crypto {
  type Cipher        = io.scalajs.nodejs.crypto.Cipher
  type Decipher      = io.scalajs.nodejs.crypto.Decipher
  type DiffieHellman = io.scalajs.nodejs.crypto.DiffieHellman
  type ECDH          = io.scalajs.nodejs.crypto.ECDH
  type Hash          = io.scalajs.nodejs.crypto.Hash
  type Hmac          = io.scalajs.nodejs.crypto.Hmac
  type Sign          = io.scalajs.nodejs.crypto.Sign
  type Verify        = io.scalajs.nodejs.crypto.Verify

  val constants: Constants.type = js.native
}

@js.native
@JSImport("crypto", "constants")
object Constants extends js.Object {
  val SSL_OP_ALL: Int                                    = js.native
  val SSL_OP_ALLOW_UNSAFE_LEGACY_RENEGOTIATION: Int      = js.native
  val SSL_OP_CIPHER_SERVER_PREFERENCE: Int               = js.native
  val SSL_OP_CISCO_ANYCONNECT: Int                       = js.native
  val SSL_OP_COOKIE_EXCHANGE: Int                        = js.native
  val SSL_OP_CRYPTOPRO_TLSEXT_BUG: Int                   = js.native
  val SSL_OP_DONT_INSERT_EMPTY_FRAGMENTS: Int            = js.native
  val SSL_OP_EPHEMERAL_RSA: Int                          = js.native
  val SSL_OP_LEGACY_SERVER_CONNECT: Int                  = js.native
  val SSL_OP_MICROSOFT_BIG_SSLV3_BUFFER: Int             = js.native
  val SSL_OP_MICROSOFT_SESS_ID_BUG: Int                  = js.native
  val SSL_OP_MSIE_SSLV2_RSA_PADDING: Int                 = js.native
  val SSL_OP_NETSCAPE_CA_DN_BUG: Int                     = js.native
  val SSL_OP_NETSCAPE_CHALLENGE_BUG: Int                 = js.native
  val SSL_OP_NETSCAPE_DEMO_CIPHER_CHANGE_BUG: Int        = js.native
  val SSL_OP_NETSCAPE_REUSE_CIPHER_CHANGE_BUG: Int       = js.native
  val SSL_OP_NO_COMPRESSION: Int                         = js.native
  val SSL_OP_NO_QUERY_MTU: Int                           = js.native
  val SSL_OP_NO_SESSION_RESUMPTION_ON_RENEGOTIATION: Int = js.native
  val SSL_OP_NO_SSLv2: Int                               = js.native
  val SSL_OP_NO_SSLv3: Int                               = js.native
  val SSL_OP_NO_TICKET: Int                              = js.native
  val SSL_OP_NO_TLSv1: Int                               = js.native
  val SSL_OP_NO_TLSv1_1: Int                             = js.native
  val SSL_OP_NO_TLSv1_2: Int                             = js.native
  val SSL_OP_PKCS1_CHECK_1: Int                          = js.native
  val SSL_OP_PKCS1_CHECK_2: Int                          = js.native
  val SSL_OP_SINGLE_DH_USE: Int                          = js.native
  val SSL_OP_SINGLE_ECDH_USE: Int                        = js.native
  val SSL_OP_SSLEAY_080_CLIENT_DH_BUG: Int               = js.native
  val SSL_OP_SSLREF2_REUSE_CERT_TYPE_BUG: Int            = js.native
  val SSL_OP_TLS_BLOCK_PADDING_BUG: Int                  = js.native
  val SSL_OP_TLS_D5_BUG: Int                             = js.native
  val SSL_OP_TLS_ROLLBACK_BUG: Int                       = js.native

  val ENGINE_METHOD_RSA: Int             = js.native
  val ENGINE_METHOD_DSA: Int             = js.native
  val ENGINE_METHOD_DH: Int              = js.native
  val ENGINE_METHOD_RAND: Int            = js.native
  val ENGINE_METHOD_EC: Int              = js.native
  val ENGINE_METHOD_CIPHERS: Int         = js.native
  val ENGINE_METHOD_DIGESTS: Int         = js.native
  val ENGINE_METHOD_PKEY_METHS: Int      = js.native
  val ENGINE_METHOD_PKEY_ASN1_METHS: Int = js.native
  val ENGINE_METHOD_ALL: Int             = js.native
  val ENGINE_METHOD_NONE: Int            = js.native

  val DH_CHECK_P_NOT_SAFE_PRIME: Int    = js.native
  val DH_CHECK_P_NOT_PRIME: Int         = js.native
  val DH_UNABLE_TO_CHECK_GENERATOR: Int = js.native
  val DH_NOT_SUITABLE_GENERATOR: Int    = js.native
  val ALPN_ENABLED: Int                 = js.native
  val RSA_PKCS1_PADDING: Int            = js.native
  val RSA_SSLV23_PADDING: Int           = js.native
  val RSA_NO_PADDING: Int               = js.native
  val RSA_PKCS1_OAEP_PADDING: Int       = js.native
  val RSA_X931_PADDING: Int             = js.native
  val RSA_PKCS1_PSS_PADDING: Int        = js.native
  val RSA_PSS_SALTLEN_DIGEST: Int       = js.native
  val RSA_PSS_SALTLEN_MAX_SIGN: Int     = js.native
  val RSA_PSS_SALTLEN_AUTO: Int         = js.native

  val POINT_CONVERSION_COMPRESSED: Int   = js.native
  val POINT_CONVERSION_UNCOMPRESSED: Int = js.native
  val POINT_CONVERSION_HYBRID: Int       = js.native

  val defaultCoreCipherList: String = js.native
  val defaultCipherList: String     = js.native
}

trait CreatePrivateKeyOptions extends js.Object {
  var key: String | Buffer
  var format: js.UndefOr[String]              = js.undefined
  var `type`: js.UndefOr[String]              = js.undefined
  var passphrase: js.UndefOr[String | Buffer] = js.undefined
}
object CreatePrivateKeyOptions {
  def apply(
      key: String | Buffer,
      format: js.UndefOr[String] = js.undefined,
      `type`: js.UndefOr[String] = js.undefined,
      passphrase: js.UndefOr[String | Buffer] = js.undefined
  ): CreatePrivateKeyOptions = {
    val _obj$ = js.Dynamic.literal(
      "key" -> key.asInstanceOf[js.Any]
    )
    format.foreach(_v => _obj$.updateDynamic("format")(_v.asInstanceOf[js.Any]))
    `type`.foreach(_v => _obj$.updateDynamic("type")(_v.asInstanceOf[js.Any]))
    passphrase.foreach(_v => _obj$.updateDynamic("passphrase")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[CreatePrivateKeyOptions]
  }
}

trait CreatePublicKeyOptions extends js.Object {
  var key: String | Buffer
  var format: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}
object CreatePublicKeyOptions {
  def apply(
      key: String | Buffer,
      format: js.UndefOr[String] = js.undefined,
      `type`: js.UndefOr[String] = js.undefined
  ): CreatePublicKeyOptions = {
    val _obj$ = js.Dynamic.literal(
      "key" -> key.asInstanceOf[js.Any]
    )
    format.foreach(_v => _obj$.updateDynamic("format")(_v.asInstanceOf[js.Any]))
    `type`.foreach(_v => _obj$.updateDynamic("type")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[CreatePublicKeyOptions]
  }
}

trait GenerateKeyOptions extends js.Object {
  var length: Int
}
object GenerateKeyOptions {
  def apply(
      length: Int
  ): GenerateKeyOptions = {
    val _obj$ = js.Dynamic.literal(
      "length" -> length.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[GenerateKeyOptions]
  }
}

trait GeneratePrimeOptions extends js.Object {
  var add: js.UndefOr[ArrayBuffer | SharedArrayBuffer | TypedArray[_, _] | Buffer | DataView | js.BigInt] = js.undefined
  var rem: js.UndefOr[ArrayBuffer | SharedArrayBuffer | TypedArray[_, _] | Buffer | DataView | js.BigInt] = js.undefined
  var safe: js.UndefOr[Boolean]                                                                           = js.undefined
  var bigint: js.UndefOr[Boolean]                                                                         = js.undefined
}
object GeneratePrimeOptions {
  def apply(
      add: js.UndefOr[ArrayBuffer | SharedArrayBuffer | TypedArray[_, _] | Buffer | DataView | js.BigInt] =
        js.undefined,
      rem: js.UndefOr[ArrayBuffer | SharedArrayBuffer | TypedArray[_, _] | Buffer | DataView | js.BigInt] =
        js.undefined,
      safe: js.UndefOr[Boolean] = js.undefined,
      bigint: js.UndefOr[Boolean] = js.undefined
  ): GeneratePrimeOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    add.foreach(_v => _obj$.updateDynamic("add")(_v.asInstanceOf[js.Any]))
    rem.foreach(_v => _obj$.updateDynamic("rem")(_v.asInstanceOf[js.Any]))
    safe.foreach(_v => _obj$.updateDynamic("safe")(_v.asInstanceOf[js.Any]))
    bigint.foreach(_v => _obj$.updateDynamic("bigint")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[GeneratePrimeOptions]
  }
}

trait GenerateKeyPairOptions extends js.Object {
  var modulusLength: Int
  var publicExponent: js.UndefOr[Int]                        = js.undefined
  var divisorLength: js.UndefOr[Int]                         = js.undefined
  var namedCurve: js.UndefOr[String]                         = js.undefined
  var publicKeyEncoding: js.UndefOr[KeyObjectExportOptions]  = js.undefined
  var privateKeyEncoding: js.UndefOr[KeyObjectExportOptions] = js.undefined
}

object GenerateKeyPairOptions {
  def apply(
      modulusLength: Int,
      publicExponent: js.UndefOr[Int] = js.undefined,
      divisorLength: js.UndefOr[Int] = js.undefined,
      namedCurve: js.UndefOr[String] = js.undefined,
      publicKeyEncoding: js.UndefOr[KeyObjectExportOptions] = js.undefined,
      privateKeyEncoding: js.UndefOr[KeyObjectExportOptions] = js.undefined
  ): GenerateKeyPairOptions = {
    val _obj$ = js.Dynamic.literal(
      "modulusLength" -> modulusLength.asInstanceOf[js.Any]
    )
    publicExponent.foreach(_v => _obj$.updateDynamic("publicExponent")(_v.asInstanceOf[js.Any]))
    divisorLength.foreach(_v => _obj$.updateDynamic("divisorLength")(_v.asInstanceOf[js.Any]))
    namedCurve.foreach(_v => _obj$.updateDynamic("namedCurve")(_v.asInstanceOf[js.Any]))
    publicKeyEncoding.foreach(_v => _obj$.updateDynamic("publicKeyEncoding")(_v.asInstanceOf[js.Any]))
    privateKeyEncoding.foreach(_v => _obj$.updateDynamic("privateKeyEncoding")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[GenerateKeyPairOptions]
  }
}

trait ScryptOptions extends js.Object {
  var cost: js.UndefOr[Int]            = js.undefined
  var blockSize: js.UndefOr[Int]       = js.undefined
  var parallelization: js.UndefOr[Int] = js.undefined
  var N: js.UndefOr[Int]               = js.undefined
  var r: js.UndefOr[Int]               = js.undefined
  var p: js.UndefOr[Int]               = js.undefined
  var maxmem: js.UndefOr[Int]          = js.undefined
}
object ScryptOptions {
  def apply(
      cost: js.UndefOr[Int] = js.undefined,
      blockSize: js.UndefOr[Int] = js.undefined,
      parallelization: js.UndefOr[Int] = js.undefined,
      N: js.UndefOr[Int] = js.undefined,
      r: js.UndefOr[Int] = js.undefined,
      p: js.UndefOr[Int] = js.undefined,
      maxmem: js.UndefOr[Int] = js.undefined
  ): ScryptOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    cost.foreach(_v => _obj$.updateDynamic("cost")(_v.asInstanceOf[js.Any]))
    blockSize.foreach(_v => _obj$.updateDynamic("blockSize")(_v.asInstanceOf[js.Any]))
    parallelization.foreach(_v => _obj$.updateDynamic("parallelization")(_v.asInstanceOf[js.Any]))
    N.foreach(_v => _obj$.updateDynamic("N")(_v.asInstanceOf[js.Any]))
    r.foreach(_v => _obj$.updateDynamic("r")(_v.asInstanceOf[js.Any]))
    p.foreach(_v => _obj$.updateDynamic("p")(_v.asInstanceOf[js.Any]))
    maxmem.foreach(_v => _obj$.updateDynamic("maxmem")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[ScryptOptions]
  }
}

trait KeyPair extends js.Object {
  var publicKey: String | Buffer | KeyObject
  var privateKey: String | Buffer | KeyObject
}
object KeyPair {
  def apply(
      publicKey: String | Buffer | KeyObject,
      privateKey: String | Buffer | KeyObject
  ): KeyPair = {
    val _obj$ = js.Dynamic.literal(
      "publicKey"  -> publicKey.asInstanceOf[js.Any],
      "privateKey" -> privateKey.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[KeyPair]
  }
}

trait CheckPrimeOptions extends js.Object {
  var checks: js.UndefOr[Int] = js.undefined
}
object CheckPrimeOptions {
  def apply(
      checks: js.UndefOr[Int] = js.undefined
  ): CheckPrimeOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    checks.foreach(_v => _obj$.updateDynamic("checks")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[CheckPrimeOptions]
  }
}

trait CipherInfo extends js.Object {
  var name: String
  var nid: Double
  var blockSize: Double
  var ivLength: Int
  var keyLength: Int
  var mode: String
}
object CipherInfo {
  def apply(
      name: String,
      nid: Double,
      blockSize: Double,
      ivLength: Int,
      keyLength: Int,
      mode: String
  ): CipherInfo = {
    val _obj$ = js.Dynamic.literal(
      "name"      -> name.asInstanceOf[js.Any],
      "nid"       -> nid.asInstanceOf[js.Any],
      "blockSize" -> blockSize.asInstanceOf[js.Any],
      "ivLength"  -> ivLength.asInstanceOf[js.Any],
      "keyLength" -> keyLength.asInstanceOf[js.Any],
      "mode"      -> mode.asInstanceOf[js.Any]
    )
    _obj$.asInstanceOf[CipherInfo]
  }
}

trait GetCipherInfoOptions extends js.Object {
  var keyLength: js.UndefOr[Int] = js.undefined
  var ivLength: js.UndefOr[Int]  = js.undefined
}
object GetCipherInfoOptions {
  def apply(
      keyLength: js.UndefOr[Int] = js.undefined,
      ivLength: js.UndefOr[Int] = js.undefined
  ): GetCipherInfoOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    keyLength.foreach(_v => _obj$.updateDynamic("keyLength")(_v.asInstanceOf[js.Any]))
    ivLength.foreach(_v => _obj$.updateDynamic("ivLength")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[GetCipherInfoOptions]
  }
}

trait RandomUUIDOptions extends js.Object {
  var disableEntropyCache: js.UndefOr[Boolean] = js.undefined
}
object RandomUUIDOptions {
  def apply(
      disableEntropyCache: js.UndefOr[Boolean] = js.undefined
  ): RandomUUIDOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    disableEntropyCache.foreach(_v => _obj$.updateDynamic("disableEntropyCache")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[RandomUUIDOptions]
  }
}

trait HeapUsed extends js.Object {
  var total: Double
  var min: Double
  var used: Double
  var utilization: Double
}
