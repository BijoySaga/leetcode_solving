class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        value_counts = defaultdict(int)  # Tracks the frequency of each unique value
        unique_occurrence_counts = set()  # Stores unique occurrence counts to check for duplicates

        for number in arr:
            value_counts[number] += 1

        for occurrence_count in value_counts.values():
            if occurrence_count in unique_occurrence_counts:
                return False  # Duplicate occurrence count found, indicating non-unique occurrences
            unique_occurrence_counts.add(occurrence_count)

        return True  # All occurrence counts were unique
