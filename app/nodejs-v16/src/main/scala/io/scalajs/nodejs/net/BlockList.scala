package io.scalajs.nodejs.net

import com.thoughtworks.enableMembersIf

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("net", "BlockList")
@enableMembersIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs16)
class BlockList() extends js.Object {
  def addAddress(address: String, `type`: String): Unit        = js.native
  def addAddress(address: SocketAddress, `type`: String): Unit = js.native
  def addAddress(address: String): Unit                        = js.native
  def addAddress(address: SocketAddress): Unit                 = js.native

  def addRange(start: SocketAddress, end: SocketAddress, `type`: String): Unit = js.native
  def addRange(start: SocketAddress, end: String, `type`: String): Unit        = js.native
  def addRange(start: String, end: SocketAddress, `type`: String): Unit        = js.native
  def addRange(start: String, end: String, `type`: String): Unit               = js.native
  def addRange(start: SocketAddress, end: SocketAddress): Unit                 = js.native
  def addRange(start: SocketAddress, end: String): Unit                        = js.native
  def addRange(start: String, end: SocketAddress): Unit                        = js.native
  def addRange(start: String, end: String): Unit                               = js.native

  def addSubnet(net: SocketAddress, prefix: Int, `type`: String): Unit = js.native
  def addSubnet(net: String, prefix: Int, `type`: String): Unit        = js.native
  def addSubnet(net: SocketAddress, prefix: Int): Unit                 = js.native
  def addSubnet(net: String, prefix: Int): Unit                        = js.native

  def check(address: SocketAddress, `type`: String): Boolean = js.native
  def check(address: String, `type`: String): Boolean        = js.native
  def check(address: SocketAddress): Boolean                 = js.native
  def check(address: String): Boolean                        = js.native

  def rules: js.Array[String] = js.native
}
