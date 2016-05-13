package org.mule.modules.trello.bean;

public class MemberActionsByIdOrUsernameGetResponse extends StatusResponse {
	private String idMemberCreator;

    private String id;

    private Data data;

    private String type;

    private String date;

    private MemberCreator memberCreator;

    public String getIdMemberCreator ()
    {
        return idMemberCreator;
    }

    public void setIdMemberCreator (String idMemberCreator)
    {
        this.idMemberCreator = idMemberCreator;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public Data getData ()
    {
        return data;
    }

    public void setData (Data data)
    {
        this.data = data;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getDate ()
    {
        return date;
    }

    public void setDate (String date)
    {
        this.date = date;
    }

    public MemberCreator getMemberCreator ()
    {
        return memberCreator;
    }

    public void setMemberCreator (MemberCreator memberCreator)
    {
        this.memberCreator = memberCreator;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [idMemberCreator = "+idMemberCreator+", id = "+id+", data = "+data+", type = "+type+", date = "+date+", memberCreator = "+memberCreator+"]";
    }

}