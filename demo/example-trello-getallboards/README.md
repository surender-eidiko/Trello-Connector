## Trello Anypoint™ Connector


[Trello Connector to connect to Trello]

## Author
: 
Eidiko Systems Integrators.

## Supported Mule runtime versions
:
Mule 3.7.0

## Trello supported versions
:
Trello Version 1.0 and above.

## Service or application supported modules
Example: Trello 

## Running the Demo

The Demo is used to get all the boards in trello. The Trello connector gets the boards for the user whose authorization token is used to connect to it.

To get the boards in connector properties select 'Get all boards' operation and provide a authorization token in Token field in General.


To run the demo open a browser and type http://localhost:8081/. It will trigger the flow. And you will see the below reply in the browser


{
	"statusCode": 200,
	"statusMessage": null,
	"invitations": null,
	"dateLastActivity": "2016-08-18T14:39:13.959Z",
	"idTags": [],
	"desc": "",
	"descData": null,
	"shortLink": "CuxSyI6J",
	"dateLastView": "2016-08-21T08:40:06.101Z",
	"subscribed": false,
	"url": "https://trello.com/b/CuxSyI6J/cisco-demo",
	"labelNames": {
		"orange": "",
		"sky": "",
		"red": "",
		"purple": "",
		"blue": "",
		"green": "",
		"pink": "",
		"lime": "",
		"yellow": "",
		"black": ""
	},
	"id": "57b54e1f7926522364c06d3c",
	"prefs": {
		"invitations": "members",
		"cardAging": "regular",
		"backgroundColor": "#0079BF",
		"canInvite": true,
		"calendarFeedEnabled": false,
		"backgroundImage": null,
		"cardCovers": true,
		"canBePublic": true,
		"canBeOrg": true,
		"permissionLevel": "private",
		"selfJoin": false,
		"backgroundBrightness": "dark",
		"background": "blue",
		"backgroundImageScaled": null,
		"voting": "disabled",
		"canBePrivate": true,
		"comments": "members",
		"backgroundTile": false
	},
	"idOrganization": null,
	"starred": "false",
	"pinned": null,
	"name": "Cisco_Demo",
	"powerUps": [],
	"memberships": [{
		"id": "57b54e1f7926522364c06d3d",
		"orgMemberType": null,
		"idMember": "5797395c28a292c12c93bb6c",
		"memberType": "admin",
		"unconfirmed": false,
		"deactivated": false
	}, {
		"id": "57b54fdc5f395838c4a76aab",
		"orgMemberType": null,
		"idMember": "57b54fdc5f395838c4a76aaa",
		"memberType": "normal",
		"unconfirmed": true,
		"deactivated": false
	}, {
		"id": "57b550031e0494e311c5bc22",
		"orgMemberType": null,
		"idMember": "5791eb5e16e86a333692dbfc",
		"memberType": "normal",
		"unconfirmed": false,
		"deactivated": false
	}],
	"shortUrl": "https://trello.com/b/CuxSyI6J",
	"closed": "false",
	"invited": "false"
}

