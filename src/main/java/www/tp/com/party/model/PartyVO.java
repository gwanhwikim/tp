package www.tp.com.party.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PartyVO {
	private String partyId="";
	private String partyPw; //
	private String name; //
	private String roleName;
	private static final char OwnerType = 'O';
	private static final char MemberType = 'M';
	public PartyVO(String partyId) {
		super();
		this.partyId = partyId;
	}
	

	
	//해시태그
}
