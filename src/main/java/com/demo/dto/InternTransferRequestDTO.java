package com.demo.dto;

public record InternTransferRequestDTO(float amount, Long walletSenderId, Long walletReceiverId, Long cardSenderId, Long cardReceiverId) { }
