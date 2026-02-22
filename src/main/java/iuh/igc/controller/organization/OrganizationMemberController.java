package iuh.igc.controller.organization;

import iuh.igc.dto.base.ApiResponse;
import iuh.igc.service.organization.OrganizationMemberService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.jspecify.annotations.NonNull;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Admin 2/20/2026
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/organizations")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class OrganizationMemberController {

    OrganizationMemberService organizationMemberService;

    @PostMapping("/{id}/members/{userId}/promote-moderator")
    public ApiResponse<@NonNull Void> promoteToModerator(
            @PathVariable("id") Long id,
            @PathVariable("userId") Long userId
    ) {
        organizationMemberService.promoteToModerator(id, userId);
        return ApiResponse.<Void>builder().build();
    }

    @PostMapping("/{id}/members/{userId}/demote-member")
    public ApiResponse<@NonNull Void> demoteToMember(
            @PathVariable("id") Long id,
            @PathVariable("userId") Long userId
    ) {
        organizationMemberService.demoteToMember(id, userId);
        return ApiResponse.<Void>builder().build();
    }

    @DeleteMapping("/{id}/members/{userId}")
    public ApiResponse<@NonNull Void> kickMember(
            @PathVariable("id") Long id,
            @PathVariable("userId") Long userId
    ) {
        organizationMemberService.kickMember(id, userId);
        return ApiResponse.<Void>builder().build();
    }
}
