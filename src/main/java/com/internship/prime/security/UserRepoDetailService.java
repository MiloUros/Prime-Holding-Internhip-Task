package com.internship.prime.security;

import com.internship.prime.CommonErrorMessages;
import com.internship.prime.exceptions.UserNotFoundException;
import com.internship.prime.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserRepoDetailService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByUserName(username).map(user -> new SecurityUserDetails(user, username))
                .orElseThrow(() -> new UserNotFoundException(CommonErrorMessages.USER_NOT_FOUND));
    }

}
