Feature: Verifying the files in S3 for multiple data loads


@LOAD_HPI_Files
Scenario: Verify the LOAD_HPI files
       Given Login into AWS console
       When Search for S3 Bucket name in search text box
       And Search for different load names in search text box
       Then Verify dat File is present in that location