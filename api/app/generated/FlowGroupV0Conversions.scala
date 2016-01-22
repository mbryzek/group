/**
 * Generated by apidoc - http://www.apidoc.me
 * Service version: 0.0.1
 * apidoc:0.11.6 http://www.apidoc.me/flow/group/0.0.1/anorm_2_x_parsers
 */
package io.flow.group.v0.anorm.conversions {

  import anorm.{Column, MetaDataItem, TypeDoesNotMatch}
  import play.api.libs.json.{JsArray, JsObject, JsValue}
  import scala.util.{Failure, Success, Try}

  /**
    * Conversions to collections of objects using JSON.
    */
  object Json {

    def parser[T](
      f: play.api.libs.json.JsValue => T
    ) = anorm.Column.nonNull1 { (value, meta) =>
      val MetaDataItem(qualified, nullable, clazz) = meta
      value match {
        case json: org.postgresql.util.PGobject => {
          Try {
            f(
              play.api.libs.json.Json.parse(
                json.getValue
              )
            )
          } match {
            case Success(result) => Right(result)
            case Failure(ex) => Left(
              TypeDoesNotMatch(
                s"Column[$qualified] error parsing json $value: $ex"
              )
            )
          }
        }
        case _=> {
          Left(
            TypeDoesNotMatch(
              s"Column[$qualified] error converting $value: ${value.asInstanceOf[AnyRef].getClass} to Json"
            )
          )
        }


      }
    }

    implicit val columnToJsObject: Column[play.api.libs.json.JsObject] = parser { _.as[play.api.libs.json.JsObject] }

    implicit val columnToSeqBoolean: Column[Seq[Boolean]] = parser { _.as[Seq[Boolean]] }
    implicit val columnToMapBoolean: Column[Map[String, Boolean]] = parser { _.as[Map[String, Boolean]] }
    implicit val columnToSeqDouble: Column[Seq[Double]] = parser { _.as[Seq[Double]] }
    implicit val columnToMapDouble: Column[Map[String, Double]] = parser { _.as[Map[String, Double]] }
    implicit val columnToSeqInt: Column[Seq[Int]] = parser { _.as[Seq[Int]] }
    implicit val columnToMapInt: Column[Map[String, Int]] = parser { _.as[Map[String, Int]] }
    implicit val columnToSeqLong: Column[Seq[Long]] = parser { _.as[Seq[Long]] }
    implicit val columnToMapLong: Column[Map[String, Long]] = parser { _.as[Map[String, Long]] }
    implicit val columnToSeqLocalDate: Column[Seq[_root_.org.joda.time.LocalDate]] = parser { _.as[Seq[_root_.org.joda.time.LocalDate]] }
    implicit val columnToMapLocalDate: Column[Map[String, _root_.org.joda.time.LocalDate]] = parser { _.as[Map[String, _root_.org.joda.time.LocalDate]] }
    implicit val columnToSeqDateTime: Column[Seq[_root_.org.joda.time.DateTime]] = parser { _.as[Seq[_root_.org.joda.time.DateTime]] }
    implicit val columnToMapDateTime: Column[Map[String, _root_.org.joda.time.DateTime]] = parser { _.as[Map[String, _root_.org.joda.time.DateTime]] }
    implicit val columnToSeqBigDecimal: Column[Seq[BigDecimal]] = parser { _.as[Seq[BigDecimal]] }
    implicit val columnToMapBigDecimal: Column[Map[String, BigDecimal]] = parser { _.as[Map[String, BigDecimal]] }
    implicit val columnToSeqJsObject: Column[Seq[_root_.play.api.libs.json.JsObject]] = parser { _.as[Seq[_root_.play.api.libs.json.JsObject]] }
    implicit val columnToMapJsObject: Column[Map[String, _root_.play.api.libs.json.JsObject]] = parser { _.as[Map[String, _root_.play.api.libs.json.JsObject]] }
    implicit val columnToSeqString: Column[Seq[String]] = parser { _.as[Seq[String]] }
    implicit val columnToMapString: Column[Map[String, String]] = parser { _.as[Map[String, String]] }
    implicit val columnToSeqUUID: Column[Seq[_root_.java.util.UUID]] = parser { _.as[Seq[_root_.java.util.UUID]] }
    implicit val columnToMapUUID: Column[Map[String, _root_.java.util.UUID]] = parser { _.as[Map[String, _root_.java.util.UUID]] }

    import io.flow.group.v0.models.json._
    implicit val columnToSeqGroupGroup: Column[Seq[_root_.io.flow.group.v0.models.Group]] = parser { _.as[Seq[_root_.io.flow.group.v0.models.Group]] }
    implicit val columnToMapGroupGroup: Column[Map[String, _root_.io.flow.group.v0.models.Group]] = parser { _.as[Map[String, _root_.io.flow.group.v0.models.Group]] }
    implicit val columnToSeqGroupGroupVersion: Column[Seq[_root_.io.flow.group.v0.models.GroupVersion]] = parser { _.as[Seq[_root_.io.flow.group.v0.models.GroupVersion]] }
    implicit val columnToMapGroupGroupVersion: Column[Map[String, _root_.io.flow.group.v0.models.GroupVersion]] = parser { _.as[Map[String, _root_.io.flow.group.v0.models.GroupVersion]] }
    implicit val columnToSeqGroupMembership: Column[Seq[_root_.io.flow.group.v0.models.Membership]] = parser { _.as[Seq[_root_.io.flow.group.v0.models.Membership]] }
    implicit val columnToMapGroupMembership: Column[Map[String, _root_.io.flow.group.v0.models.Membership]] = parser { _.as[Map[String, _root_.io.flow.group.v0.models.Membership]] }
    implicit val columnToSeqGroupMembershipVersion: Column[Seq[_root_.io.flow.group.v0.models.MembershipVersion]] = parser { _.as[Seq[_root_.io.flow.group.v0.models.MembershipVersion]] }
    implicit val columnToMapGroupMembershipVersion: Column[Map[String, _root_.io.flow.group.v0.models.MembershipVersion]] = parser { _.as[Map[String, _root_.io.flow.group.v0.models.MembershipVersion]] }
    implicit val columnToSeqGroupUser: Column[Seq[_root_.io.flow.group.v0.models.User]] = parser { _.as[Seq[_root_.io.flow.group.v0.models.User]] }
    implicit val columnToMapGroupUser: Column[Map[String, _root_.io.flow.group.v0.models.User]] = parser { _.as[Map[String, _root_.io.flow.group.v0.models.User]] }
    implicit val columnToSeqGroupUserReference: Column[Seq[_root_.io.flow.group.v0.models.UserReference]] = parser { _.as[Seq[_root_.io.flow.group.v0.models.UserReference]] }
    implicit val columnToMapGroupUserReference: Column[Map[String, _root_.io.flow.group.v0.models.UserReference]] = parser { _.as[Map[String, _root_.io.flow.group.v0.models.UserReference]] }
    implicit val columnToSeqGroupExpandableUser: Column[Seq[_root_.io.flow.group.v0.models.ExpandableUser]] = parser { _.as[Seq[_root_.io.flow.group.v0.models.ExpandableUser]] }
    implicit val columnToMapGroupExpandableUser: Column[Map[String, _root_.io.flow.group.v0.models.ExpandableUser]] = parser { _.as[Map[String, _root_.io.flow.group.v0.models.ExpandableUser]] }

  }

}