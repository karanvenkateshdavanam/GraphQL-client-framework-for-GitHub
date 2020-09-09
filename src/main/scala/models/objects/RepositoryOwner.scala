package models.objects

case class RepositoryOwner(login: String, url: String) extends GraphQLObject{

  def getLoginUserName: String = login

  def getOwnerHttpUrl : String = url

}