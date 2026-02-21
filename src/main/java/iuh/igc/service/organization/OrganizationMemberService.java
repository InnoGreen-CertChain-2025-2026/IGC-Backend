package iuh.igc.service.organization;

import org.springframework.transaction.annotation.Transactional;

public interface OrganizationMemberService {

    @Transactional
    void promoteToModerator(Long organizationId, Long targetUserId);

    @Transactional
    void demoteToMember(Long organizationId, Long targetUserId);

    @Transactional
    void kickMember(Long organizationId, Long targetUserId);
}
